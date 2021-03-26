package com.seven.cloud.service.impl;

import com.seven.cloud.dao.UserDao;
import com.seven.cloud.entity.User;
import com.seven.cloud.service.UserService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: TODO
 * @date 2021/3/25 8:13 下午
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public int add(User user) {
        return userDao.add(user);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
