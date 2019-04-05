package com.wulis.core.config;


import com.wulis.util.wrapper.WrapMapper;
import com.wulis.util.wrapper.Wrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Auther: Herman
 * @Date: 2019/3/18 10:54
 * @Description: 全局异常处理
 */
@Slf4j
public class ExceptionHandling {
    /**
     * 通用统一异常处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public Wrapper exceptionHandler(Exception e) {
        log.error(e.getMessage());
        return WrapMapper.error();
    }
}
