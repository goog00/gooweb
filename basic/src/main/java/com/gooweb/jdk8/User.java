package com.gooweb.jdk8;

import lombok.Data;

/**
 * @author steng
 * @description
 * @date 2020-10-29 11:16
 **/
@Data
public class User {

    private String userName;

    private Integer score;

    User(String userName){
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
