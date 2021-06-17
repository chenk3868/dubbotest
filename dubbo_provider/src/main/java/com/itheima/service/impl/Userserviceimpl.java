package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import com.itheima.user.User;
import org.springframework.beans.factory.annotation.Autowired;

public class Userserviceimpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }
}
