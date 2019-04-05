package com.wulis.provider.sysOperationLog.model.dto;

import com.wulis.core.mybatis.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "admin_sys_operation_log")
public class SysOperationLogDto extends BaseEntity {

    /**
     * 操作名称
     */
    @Column(name = "operation_name")
    private String operationName;

    /**
     * 描述
     */
    private String description;

    /**
     * 操作类型
     */
    @Column(name = "operation_type")
    private String operationType;

    /**
     * 操作结果:0成功，1失败
     */
    @Column(name = "operation_result")
    private String operationResult;

    /**
     * 接口地址
     */
    @Column(name = "interface_add")
    private String interfaceAdd;

    /**
     * ip地址
     */
    @Column(name = "ip_add")
    private String ipAdd;

    /**
     * 执行开始时间
     */
    @Column(name = "execution_start_time")
    private String executionStartTime;

    /**
     * 执行结束时间
     */
    @Column(name = "execution_end_time")
    private String executionEndTime;

    /**
     * 是否删除：0未删除 ，1已删除
     */
    @Column(name = "is_del")
    private String isDel;

    /**
     * 请求参数
     */
    @Column(name = "request_param")
    private String requestParam;

    /**
     * 返回参数
     */
    @Column(name = "return_param")
    private String returnParam;

}