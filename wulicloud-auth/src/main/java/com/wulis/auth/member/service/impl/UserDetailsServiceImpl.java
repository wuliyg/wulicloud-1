package com.wulis.auth.member.service.impl;

import com.wulis.auth.member.mapper.UserDetailsMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Resource
    private UserDetailsMapper userDetailsMapper;

    @Override
    public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
        //如果数据库存的账号密码未加密，则取出时须将密码加密
//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        userDetail.setPassword(bCryptPasswordEncoder.encode(userDetail.getPassword()));
        return userDetailsMapper.queryUserDetailsByName(account);
    }
}
