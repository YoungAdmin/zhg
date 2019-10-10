package com.ovozz.zhg.service;

import com.ovozz.zhg.entity.User;

public interface UserService {

    Iterable<User> findAll();

    User save(User user);
}
