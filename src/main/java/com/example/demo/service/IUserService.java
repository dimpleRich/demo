package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {
    /**
     * 根据接口查询所用的用户
     */
    public List<User> findAllUser();
}
