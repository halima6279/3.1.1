package com.example.demo.dao;


import com.example.demo.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select a from User a", User.class).getResultList();
    }

    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteById(int id) {
        entityManager.remove(getUserById(id));
    }

    @Override
    public void updateUser(int id, User user) {
        User user1;
        user1 = getUserById(id);
        entityManager.detach(user1);
        user1.setName(user.getName());
        entityManager.merge(user1);
    }
}
