package com.planos.appbackend.database.repositories;

import com.planos.appbackend.apis.model.UserModel;
import org.apache.catalina.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserInterface
        extends MongoRepository<UserModel, String> {
    Optional<UserModel> findUserModelByEmail(String email);
}
