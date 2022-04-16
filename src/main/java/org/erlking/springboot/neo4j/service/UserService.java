package org.erlking.springboot.neo4j.service;

import org.erlking.springboot.neo4j.entity.User;

public interface UserService {

    User getUser(String name);

    User addUser(User user);
}