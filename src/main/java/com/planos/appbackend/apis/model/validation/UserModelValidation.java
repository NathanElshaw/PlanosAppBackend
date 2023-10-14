package com.planos.appbackend.apis.model.validation;

import com.planos.appbackend.apis.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserModelValidation {
    public void validateUserModel(UserModel form){
        List<String> invalidFields = new ArrayList<String>();
        if(form.getName() == null){
            invalidFields.add("Name is required");
        };
    }
}
