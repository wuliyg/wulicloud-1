package com.wulis.provider.member.model.dto;

import com.wulis.core.mybatis.BaseEntity;
import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "member_account")
public class MemberAccountDto extends BaseEntity {

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

}