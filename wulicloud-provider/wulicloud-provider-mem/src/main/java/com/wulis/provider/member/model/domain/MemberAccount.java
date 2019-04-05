package com.wulis.provider.member.model.domain;

import com.wulis.core.mybatis.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "member_account")
public class MemberAccount extends BaseEntity {

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

}