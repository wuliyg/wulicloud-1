package com.wulis.provider.sysOperationLog.web.frontend;

import com.wulis.core.support.BaseController;
import com.wulis.provider.sysOperationLog.service.SysOperationLogService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RefreshScope
@RestController
@Api(value = "API - SysOperationLogController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SysOperationLogController extends BaseController {

    @Resource
    private SysOperationLogService sysOperationLogService;
}

