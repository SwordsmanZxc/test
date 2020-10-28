package com.example.demo.service.impl;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * UserService实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listAllUser() {
        List<User> list = userMapper.findAll();
        return list;
    }

    @Override
    public User getUser(Long id) {
        User user = userMapper.findOne(id);
        return user;
    }

    @Override
    public int createUser(User user) {
        int cnt = userMapper.insert(user);
        return cnt;
    }

    @Override
    public int deleteUser(Long id) {
        int cnt = userMapper.delete(id);
        return cnt;
    }

}
