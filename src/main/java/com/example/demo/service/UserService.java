package com.example.demo.service;

import com.example.demo.model.User;
import java.util.List;

/**
 * UserService
 */
public interface UserService {
    List<User> listAllUser();

    User getUser(Long id);

    int createUser(User user);

    int deleteUser(Long id);
}
