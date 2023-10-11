package com.planos.appbackend.database.repositories;

import com.planos.appbackend.apis.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserInterface
        extends MongoRepository<UserModel, String> {
}
