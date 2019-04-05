package com.wulis.provider.authorization;

import com.wulis.provider.member.model.domain.JwtToken;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by herman on 2019/3/28.
 */
@FeignClient(value = "wulicloud-auth", fallback = AuthorizationServiceImpl.class)
public interface AuthorizationService {
    @PostMapping(value = "oauth/token")
    JwtToken authorizeToken(@RequestHeader(value = "Authorization") String authorization,
                            @RequestParam("username") String username,
                            @RequestParam("password") String password,
                            @RequestParam("grant_type") String grantType);
}
