package com.wulis.provider.member.service.impl;

import com.wulis.core.support.BaseServiceImpl;
import com.wulis.provider.authorization.AuthorizationService;
import com.wulis.provider.member.mapper.MemberAccountMapper;
import com.wulis.provider.member.model.domain.JwtToken;
import com.wulis.provider.member.model.domain.MemberAccount;
import com.wulis.provider.member.model.example.MemberAccountExample;
import com.wulis.provider.member.model.vo.MemberAccountVo;
import com.wulis.provider.member.service.MemberAccountService;
import com.wulis.util.wrapper.WrapMapper;
import com.wulis.util.wrapper.Wrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import sun.misc.BASE64Encoder;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class MemberAccountServiceImpl extends BaseServiceImpl<MemberAccount> implements MemberAccountService {

    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    private static final String CLIENT_ID_AND_SECRET = "wulicloud-provider-mem:auth";
    private static BASE64Encoder encoder = new BASE64Encoder();
    private static final Integer TOKEN_SURVIVAL_TIME = 7150;
    private static final String GRANT_TYPE = "password";
    private static String AUTHORIZATION;

    static {
        try {
            AUTHORIZATION = "Basic " + encoder.encode(CLIENT_ID_AND_SECRET.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Resource
    private MemberAccountMapper memberAccountMapper;

    @Resource
    private AuthorizationService authorizationService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 会员登录
     *
     * @param memberAccountVo
     * @return
     */
    @Override
    public Wrapper memberLogin(MemberAccountVo memberAccountVo) {
        MemberAccountExample memberAccountExample = new MemberAccountExample();
        MemberAccountExample.Criteria criteria = memberAccountExample.createCriteria();
        criteria.andAccountEqualTo(memberAccountVo.getAccount());
        MemberAccount memberAccount = memberAccountMapper.selectOneByExample(memberAccountExample);
        if (StringUtils.isEmpty(memberAccount)) return WrapMapper.error("账号不存在");
        else {
            if (bCryptPasswordEncoder.matches(memberAccountVo.getPassword(), memberAccount.getPassword())) {
                JwtToken token = authorizationService.authorizeToken(AUTHORIZATION, memberAccountVo.getAccount(), memberAccountVo.getPassword(), GRANT_TYPE);
                if (StringUtils.isEmpty(token)) return WrapMapper.error("发生错误,请重新登录");
                else {
                    //将会员token存入redis(key: 会员账号,value: 会员token,过期时间:7150s)
                    stringRedisTemplate.opsForValue().set(memberAccountVo.getAccount(), token.getAccess_token(), TOKEN_SURVIVAL_TIME, TimeUnit.SECONDS);
                    return WrapMapper.ok(token);
                }
            } else return WrapMapper.error("密码错误");
        }
    }

    /**
     * 会员退出登录
     *
     * @return
     */
    @Override
    public Wrapper memberLogout() {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        Authentication authentication = securityContext.getAuthentication();
        String account = (String) authentication.getPrincipal();
        Boolean result = stringRedisTemplate.hasKey(account);//检查key是否存在，返回boolean值
        if (result) stringRedisTemplate.delete(account);//根据key删除缓存
        return WrapMapper.ok();
    }

    /**
     * 根据账号查询会员信息
     *
     * @param memberAccountVo
     * @return
     */
    @Override
    public MemberAccount queryMemberByAccount(MemberAccountVo memberAccountVo) {
        MemberAccountExample memberAccountExample = new MemberAccountExample();
        MemberAccountExample.Criteria criteria = memberAccountExample.createCriteria();
        criteria.andAccountEqualTo(memberAccountVo.getAccount());
        return memberAccountMapper.selectOneByExample(memberAccountExample);
    }
}
