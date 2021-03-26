package com.seven.cloud.dao;

import com.seven.cloud.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: TODO
 * @date 2021/3/25 8:04 下午
 */
@Mapper
public interface UserDao{

    int add(User user);

    User getUserById(@Param("id") int id);

}
