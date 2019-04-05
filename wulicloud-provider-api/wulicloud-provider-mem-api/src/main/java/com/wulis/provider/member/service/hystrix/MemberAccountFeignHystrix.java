package com.wulis.provider.member.service.hystrix;

import com.wulis.provider.member.model.vo.MemberAccountVo;
import com.wulis.provider.member.service.MemberAccountFeignApi;
import com.wulis.util.wrapper.Wrapper;
import org.springframework.stereotype.Component;

@Component
public class MemberAccountFeignHystrix implements MemberAccountFeignApi {
    @Override
    public Wrapper queryMemberByAccount(MemberAccountVo memberAccountVo) {
        return null;
    }
}
