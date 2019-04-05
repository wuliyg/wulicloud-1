package com.wulis.provider.notice.model.vo;

import com.wulis.core.mybatis.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Table(name = "admin_notice_information")
public class NoticeInformationVo extends BaseEntity {

    /**
     * 发布时间
     */
    @Column(name = "release_time")
    private String releaseTime;

    /**
     * 标题
     */
    private String title;

    /**
     * 发布人ID
     */
    @Column(name = "publisher_id")
    private String publisherId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 描述
     */
    private String content;

}