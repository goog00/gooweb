package com.gooweb.jdk8.stream;

import lombok.Data;

/**
 * @author steng
 * @description
 * @date 2020-10-30 09:52
 **/
@Data
public class Trader {

    private String name;
    private String city;

    public Trader(String n, String c){
        this.name = n;
        this.city = c;
    }
}
