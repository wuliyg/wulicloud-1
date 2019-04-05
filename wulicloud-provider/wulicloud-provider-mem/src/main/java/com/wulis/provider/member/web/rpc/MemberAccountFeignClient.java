package com.wulis.provider.member.web.rpc;

import com.wulis.core.support.BaseController;
import com.wulis.provider.member.model.domain.MemberAccount;
import com.wulis.provider.member.model.vo.MemberAccountVo;
import com.wulis.provider.member.service.MemberAccountFeignApi;
import com.wulis.provider.member.service.MemberAccountService;
import com.wulis.util.wrapper.WrapMapper;
import com.wulis.util.wrapper.Wrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RefreshScope
@RestController
@Api(value = "API - MemberAccountFeignClient", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MemberAccountFeignClient extends BaseController implements MemberAccountFeignApi {

    @Resource
    private MemberAccountService memberAccountService;

    @Override
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    @ApiOperation(httpMethod = "POST", value = "根据账号查询会员信息")
    public Wrapper queryMemberByAccount(@RequestBody MemberAccountVo memberAccountVo) {
        //根据token获取用户信息(主要是账号)
//        SecurityContext securityContext = SecurityContextHolder.getContext();
//        Authentication authentication = securityContext.getAuthentication();
//        memberAccountVo.setAccount((String) authentication.getPrincipal());
        MemberAccount memberAccount = memberAccountService.queryMemberByAccount(memberAccountVo);
        return WrapMapper.ok(memberAccount);
    }
}

