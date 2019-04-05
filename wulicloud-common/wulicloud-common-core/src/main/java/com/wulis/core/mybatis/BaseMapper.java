package com.wulis.core.mybatis;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * The interface My mapper.
 *
 * @param <T> the type parameter @author paascloud.net@gmail.com
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
