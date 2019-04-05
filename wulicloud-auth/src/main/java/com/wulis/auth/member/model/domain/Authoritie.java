package com.wulis.auth.member.model.domain;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Data
public class Authoritie implements GrantedAuthority {
    private String authority;
}
