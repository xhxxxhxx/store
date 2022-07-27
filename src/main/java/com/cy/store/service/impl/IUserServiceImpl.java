package com.cy.store.service.impl;

import com.cy.store.entity.User;
import com.cy.store.mapper.UserMapper;
import com.cy.store.service.IUserService;
import com.cy.store.service.ex.InsertException;
import com.cy.store.service.ex.UsernameDuplicateException;
import org.springframework.beans.factory.annotation.Autowired;

public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void reg(User user) {

        String username = user.getUsername();
        User result = userMapper.findByUsername(username);
        if (result != null) {
            throw new UsernameDuplicateException("用户名被占用");
        }

        Integer rows = userMapper.insert(user);
        if (rows != 1) {
            throw new InsertException("在用户注册中产生了未知的异常");
        }
    }
}
