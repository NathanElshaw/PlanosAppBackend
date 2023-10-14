package com.planos.appbackend.apis.controller;

import com.planos.appbackend.apis.model.UserModel;
import com.planos.appbackend.apis.model.validation.UserModelValidation;
import com.planos.appbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Optional;

@RestController

public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user")
    public UserModel getUser( @RequestParam String id) {
        Optional user = userService.getUser(id);
        if(user.isPresent()){
            return (UserModel) user.get();
        }
    return null;
    }

    @PostMapping("/user")
    public UserModel addUser(@RequestBody UserModel payload){
        UserModelValidation
        return null;
    }
}
