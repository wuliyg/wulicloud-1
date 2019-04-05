package com.wulis.gateway.filters;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import lombok.extern.slf4j.Slf4j;

import java.util.Base64;


@Slf4j
@Component
public class JwtTokenFilter implements GlobalFilter, Ordered {

    private static final String LOGIN_RUL = "/mem/member/login";    //登录地址
    private static final String SWAGGER_URL = "/v2/api-docs";        //swagger接口地址
    private static final Base64.Decoder decoder = Base64.getDecoder();

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public int getOrder() {
        return -100;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String url = exchange.getRequest().getPath().pathWithinApplication().value();
        if (!LOGIN_RUL.equals(url) && !url.contains(SWAGGER_URL)) {
            String authorization = exchange.getRequest().getHeaders().getFirst("Authorization");
            if (authorization == null || authorization.isEmpty()) {
                log.info("authorization is empty...");
                ServerHttpResponse response = exchange.getResponse();
                byte[] bytes = responseData(401, "未授权");
                DataBuffer buffer = response.bufferFactory().wrap(bytes);
                response.setStatusCode(HttpStatus.OK);
                response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");
                return response.writeWith(Mono.just(buffer));
            } else {
                try {
                    String account = authorization.replace("bearer ", "").split("\\.")[1];
                    JSONObject payload = JSONObject.parseObject(new String(decoder.decode(account), "UTF-8"));
                    String token = stringRedisTemplate.opsForValue().get(payload.getString("user_name"));
                    if (token == null || token.isEmpty() || !authorization.replace("bearer ", "").equals(token)) {
                        ServerHttpResponse response = exchange.getResponse();
                        byte[] bytes = responseData(401, "token过期或无效");
                        DataBuffer buffer = response.bufferFactory().wrap(bytes);
                        response.setStatusCode(HttpStatus.OK);
                        response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");
                        return response.writeWith(Mono.just(buffer));
                    }
                } catch (Exception e) {
                    log.error(e.getMessage());
                    ServerHttpResponse response = exchange.getResponse();
                    byte[] bytes = responseData(500, "内部错误");
                    DataBuffer buffer = response.bufferFactory().wrap(bytes);
                    response.setStatusCode(HttpStatus.OK);
                    response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");
                    return response.writeWith(Mono.just(buffer));
                }
            }
        }
        return chain.filter(exchange);
    }

    private byte[] responseData(int code, String message) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", code);
        jsonObject.put("message", message);
        String content = jsonObject.toString();
        return content.getBytes();
    }
}