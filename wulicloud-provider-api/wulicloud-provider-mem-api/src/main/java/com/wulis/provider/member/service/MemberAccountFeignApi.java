package com.wulis.provider.member.service;

import com.wulis.core.config.FeginInterceptor;
import com.wulis.provider.member.model.vo.MemberAccountVo;
import com.wulis.provider.member.service.hystrix.MemberAccountFeignHystrix;
import com.wulis.util.wrapper.Wrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "wulicloud-provider-mem",configuration = FeginInterceptor.class, fallback = MemberAccountFeignHystrix.class)
public interface MemberAccountFeignApi {

    /**
     * 根据账号查询会员信息
     *
     * @return
     */
    @PostMapping(value = "member/queryMemberByAccount")
    Wrapper queryMemberByAccount(@RequestBody MemberAccountVo memberAccountVo);
}
