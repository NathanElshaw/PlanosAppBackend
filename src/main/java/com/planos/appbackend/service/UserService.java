package com.example.planosapi.service;

import com.example.planosapi.apis.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service

public class UserService {

    private List<UserModel> userList;

    public UserService() {
        userList = new ArrayList<>();

        UserModel user1 = new UserModel(1, "Ida",  32,  "ida@mail.com");
        UserModel user2 = new UserModel(2, "Hilda",  33,  "Hilda@mail.com");

        userList.addAll(Arrays.asList(user1, user2));
    }
    public Optional<UserModel> getUser(Integer id) {
        Optional optional = Optional.empty();
        for(UserModel user: userList){
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}