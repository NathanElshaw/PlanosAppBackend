package com.planos.appbackend.service;

import com.planos.appbackend.apis.model.UserModel;
import com.planos.appbackend.enums.UserModelGender;
import org.springframework.stereotype.Service;

import java.util.*;

@Service

public class UserService {

    private  List<UserModel> userList;

    public UserService() {

    }
    public Optional<Object> getUser(Integer id) {
        Optional<Object> optional = Optional.empty();
        for(UserModel user: userList){
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}