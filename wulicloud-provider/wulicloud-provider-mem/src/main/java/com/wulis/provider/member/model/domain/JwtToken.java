package com.wulis.provider.member.model.domain;

import lombok.Data;

@Data
public class JwtToken {
    private String access_token;
    private String token_type;
    private String refresh_token;
    private String expires_in;
    private String scope;
    private String jti;
}
