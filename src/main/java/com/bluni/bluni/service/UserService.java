package com.bluni.bluni.service;

import com.bluni.bluni.models.User;
import com.bluni.bluni.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public User login(String username, String password){
        User user = repo.findByUsernameAndPassword(username, password);
        return user;
    }
}

