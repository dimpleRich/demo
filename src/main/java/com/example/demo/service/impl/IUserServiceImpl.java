package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;


    public List<User> findAllUser() {
        List<User> list = userMapper.getUser();
        return list;
    }


}
