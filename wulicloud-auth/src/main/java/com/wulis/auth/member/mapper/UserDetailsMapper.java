package com.wulis.auth.member.mapper;


import com.wulis.auth.member.model.domain.UserDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDetailsMapper {
    /**
     * 根据用户名称查询用户信息
     *
     * @param account
     * @return
     */
    UserDetail queryUserDetailsByName(@Param(value = "account") String account);
}
