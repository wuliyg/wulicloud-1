package com.wulis.provider.sysOperationLog.service;

import com.wulis.core.config.FeginInterceptor;
import com.wulis.provider.sysOperationLog.service.hystrix.SysOperationLogFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "wulicloud-provider-adm",configuration = FeginInterceptor.class, fallback = SysOperationLogFeignHystrix.class)
public interface SysOperationLogFeignApi {
}
