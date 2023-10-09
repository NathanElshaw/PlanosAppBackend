package com.planos.appbackend.service;

import com.planos.appbackend.apis.model.UserModel;
import com.planos.appbackend.enums.UserModelGender;
import org.springframework.stereotype.Service;

import java.util.*;

@Service

public class UserService {

    private final List<UserModel> userList;

    public UserService() {
        userList = new ArrayList<>();

        UserModel user1 = new UserModel(1, "Ida", UserModelGender.Female,32,  "ida@mail.com");
        UserModel user2 = new UserModel(2, "Hilda", UserModelGender.Female,33,  "Hilda@mail.com");

        userList.addAll(Arrays.asList(user1, user2));
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