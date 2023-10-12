package com.planos.appbackend.apis.model;

import com.planos.appbackend.apis.model.subModels.UserModelCompany;
import com.planos.appbackend.enums.UserModelGender;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class UserModel {
    @Id
    private  String id;
    private  String name;
    private  UserModelGender gender;
    private  int age;
    @Indexed(unique = true)
    private  String email;
    private  String username;
    private  String password;
    private  String verificationCode;
    private  UserModelCompany companyInfo;

    public UserModel(String name,
                     UserModelGender gender,
                     int age,
                     String email,
                     String username,
                     String password,
                     String verificationCode,
                     UserModelCompany companyInfo) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.username = username;
        this.password = password;
        this.verificationCode = verificationCode;
        this.companyInfo = companyInfo;
    }
}