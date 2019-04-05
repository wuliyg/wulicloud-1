package com.wulis.provider.sysOperationLog.service.impl;

import com.wulis.core.support.BaseServiceImpl;
import com.wulis.provider.sysOperationLog.mapper.SysOperationLogMapper;
import com.wulis.provider.sysOperationLog.model.domain.SysOperationLog;
import com.wulis.provider.sysOperationLog.service.SysOperationLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Herman on 2019/3/11.
 */
@Slf4j
@Service
public class SysOperationLogServiceImpl extends BaseServiceImpl<SysOperationLog> implements SysOperationLogService {
    @Resource
    private SysOperationLogMapper sysOperationLogMapper;

}
