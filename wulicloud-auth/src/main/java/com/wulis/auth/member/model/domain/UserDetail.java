package com.wulis.auth.member.model.domain;

import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.List;

@Data
public class UserDetail implements UserDetails, Serializable {

    private static final long serialVersionUID = 2393269568666085258L;

    private Integer id;

    private String account;

    //如果数据库存明文密码，查出用户密码后要进行BCryptPasswordEncoder加密
    private String password;

    private List<Authoritie> authorities;

    @Override
    public String getUsername() {
        return account;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
