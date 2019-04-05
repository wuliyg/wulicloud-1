
package com.wulis.core.mybatis;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The class Base entity.
 *
 * @author paascloud.net@gmail.com
 */
@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 2393269568666085258L;

    /**
     * 主键id
     */
    @Id
    private Integer id;

    /**
     * 创建时间
     */
    @Column(name = "input_time")
    private String inputTime;


    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private String updateTime;

    /**
     * 是否启用:0启用 1禁用
     */
    @Column(name = "is_enable")
    private String isEnable;

    /**
     * 操作人
     */
    @Column(name = "operator_by")
    private String operatorBy;

    //项目集成PageHelper不要将分页参数设置为PageSize和PageNum,虽然我也想。
    /**
     * 页码
     */
    @Transient
    private Integer page = 1;

    /**
     * 页面显示数量
     */
    @Transient
    private Integer limit = 10;
}
