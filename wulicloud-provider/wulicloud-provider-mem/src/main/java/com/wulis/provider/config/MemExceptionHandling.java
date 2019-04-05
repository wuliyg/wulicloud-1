package com.wulis.provider.config;


import com.wulis.core.config.ExceptionHandling;
import com.wulis.util.wrapper.WrapMapper;
import com.wulis.util.wrapper.Wrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Auther: Herman
 * @Date: 2019/3/18 10:54
 * @Description: 全局异常处理
 */
@Slf4j
@RestControllerAdvice
public class MemExceptionHandling extends ExceptionHandling {
    //不允许访问状态码402
    private static final Integer ACCESS_DENIED_EXCEPTION_CODE = 402;

    /**
     * 方法级保护权限不足统一异常处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = AccessDeniedException.class)
    public Wrapper accessDeniedExceptionHandler(Exception e) {
        log.info(e.getMessage());
        return WrapMapper.wrap(ACCESS_DENIED_EXCEPTION_CODE, e.getMessage());
    }
}
