package com.gooweb.jdk8.lambda;

import com.gooweb.jdk8.User;

import java.util.Comparator;

/**
 * @author steng
 * @description
 * @date 2020-10-29 13:08
 **/
public class ComparatorDemo {

    public void test(){
        Comparator<User> byWeight = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getUserName().compareTo(o2.getUserName());
            }
        };
    }

    public void test2(){
        Comparator<User>  byWeight = Comparator.comparing(User::getUserName);
    }
}
