package com.wulis.provider.authorization;

import com.wulis.provider.member.model.domain.JwtToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by herman on 2019/3/28.
 */
@Slf4j
@Component
public class AuthorizationServiceImpl implements AuthorizationService {
    @Override
    public JwtToken authorizeToken(String authorization, String username, String password, String grantType) {
        return null;
    }
}
