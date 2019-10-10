package com.ovozz.zhg.dao;

import com.ovozz.zhg.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Long> {
}
