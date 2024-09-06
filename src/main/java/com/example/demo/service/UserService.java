package com.example.demo.service;

import com.example.demo.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers ();
    User getUserById(int id);
    void saveUser (User user);
    void deleteById(int id);
    void updateUser(int id, User user);

}
