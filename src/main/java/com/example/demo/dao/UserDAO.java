package com.example.demo.dao;



import com.example.demo.models.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers ();
    User getUserById(int id);
    void saveUser (User user);
    void deleteById(int id);
    void updateUser(int id, User user);
}