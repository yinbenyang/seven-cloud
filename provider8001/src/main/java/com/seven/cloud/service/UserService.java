package com.seven.cloud.service;

import com.seven.cloud.entity.User;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: TODO
 * @date 2021/3/25 8:12 下午
 */
public interface UserService {

    int add(User user);

    User getUserById(int id);

}
