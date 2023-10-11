package com.planos.appbackend.apis.model.subModels;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserModelCompany {
    private String company;
    private String companyId;
    private String companyRole;
    private String dateJoined;
}
