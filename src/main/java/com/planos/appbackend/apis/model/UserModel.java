package com.planos.appbackend.apis.model;

import com.planos.appbackend.enums.UserModelGender;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class UserModel {
    @Id
    private final int id;
    private final String name;
    private final UserModelGender gender;
    private final int age;
    private final String email;
}