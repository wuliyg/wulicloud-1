package com.wulis.provider.member.service;


import com.wulis.core.support.BaseService;
import com.wulis.provider.member.model.domain.MemberAccount;
import com.wulis.provider.member.model.vo.MemberAccountVo;
import com.wulis.util.wrapper.Wrapper;

/**
 * Created by Herman on 2019/3/11.
 */
public interface MemberAccountService extends BaseService<MemberAccount> {
    /**
     * 根据账号查询会员信息
     *
     * @param memberAccountVo
     * @return
     */
    MemberAccount queryMemberByAccount(MemberAccountVo memberAccountVo);

    /**
     * 会员登录接口
     *
     * @param memberAccountVo
     * @return
     */
    Wrapper memberLogin(MemberAccountVo memberAccountVo);

    /**
     * 会员退出登录
     *
     * @return
     */
    Wrapper memberLogout();
}
