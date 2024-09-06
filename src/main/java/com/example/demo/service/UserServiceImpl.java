package com.example.demo.service;


import com.example.demo.dao.UserDAO;
import com.example.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @Override

    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override

    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Override

    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override

    public void deleteById(int id) {
        userDAO.deleteById(id);
    }

    @Override

    public void updateUser(int id, User user) {
        userDAO.updateUser(id, user);
    }
}




