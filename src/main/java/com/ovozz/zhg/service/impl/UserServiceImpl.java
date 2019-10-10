package com.ovozz.zhg.service.impl;

import com.ovozz.zhg.dao.UserDao;
import com.ovozz.zhg.entity.User;
import com.ovozz.zhg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Iterable<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }
}
