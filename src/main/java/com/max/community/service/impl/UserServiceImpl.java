package com.max.community.service.impl;

import com.max.community.dao.UserMapper;
import com.max.community.entity.User;
import com.max.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public User findUserById(int id) {
        return mapper.selectById(id);
    }
}
