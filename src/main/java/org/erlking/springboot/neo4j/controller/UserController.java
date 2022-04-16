package org.erlking.springboot.neo4j.controller;

import org.erlking.springboot.neo4j.entity.User;
import org.erlking.springboot.neo4j.repository.UserRepository;
import org.erlking.springboot.neo4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @PostMapping(value = "/user")
    @ResponseBody
    public User addUser(@RequestBody User user){

        return  userService.addUser(user);
    }

    @GetMapping(value = "/user/{name}")
    public User getUser(@PathVariable(name = "name") String name){
        return userService.getUser(name);
    }

}