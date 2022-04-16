package org.erlking.springboot.neo4j.service.impl;

import org.erlking.springboot.neo4j.entity.User;
import org.erlking.springboot.neo4j.repository.UserRepository;
import org.erlking.springboot.neo4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUser(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public User addUser(User User) {
        return userRepository.save(User);
    }
}