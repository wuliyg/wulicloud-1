package com.wulis.provider.member.web.frontend;

import com.wulis.provider.member.model.vo.MemberAccountVo;
import com.wulis.provider.member.service.MemberAccountService;
import com.wulis.util.wrapper.Wrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RefreshScope
@RestController
@RequestMapping("member")
@Api(value = "API - MemberAccountController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MemberAccountController {
    @Resource
    private MemberAccountService memberAccountService;

    @GetMapping(value = "login")
    @ApiOperation(httpMethod = "GET", value = "会员登录接口")
    public Wrapper memberLogin(MemberAccountVo memberAccountVo) {
        return memberAccountService.memberLogin(memberAccountVo);
    }

    @GetMapping(value = "logout")
    @ApiOperation(httpMethod = "GET", value = "会员退出登录")
    public Wrapper memberLogout() {
        return memberAccountService.memberLogout();
    }
}
