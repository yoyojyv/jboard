package com.yoyojyv.jboard.controller;

import com.yoyojyv.jboard.domain.User;
import com.yoyojyv.jboard.persistence.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class UsersController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> users() {

        log.debug("***list : {}", userRepository.findAll());
        return userRepository.findAll();
    }

}
