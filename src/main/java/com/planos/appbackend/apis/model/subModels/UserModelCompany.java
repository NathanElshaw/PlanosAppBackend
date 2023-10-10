package com.planos.appbackend.apis.model.subModels;


import lombok.Data;
import java.time.ZonedDateTime;

@Data
public class UserModelCompany {
    private String company;
    private String companyId;
    private String companyRole;
    private ZonedDateTime dateJoined;

    public UserModelCompany(String company, String companyId, String companyRole, ZonedDateTime dateJoined) {
        this.company = company;
        this.companyId = companyId;
        this.companyRole = companyRole;
        this.dateJoined = dateJoined;
    }
}
