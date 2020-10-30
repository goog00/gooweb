package com.gooweb.jdk8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author steng
 * @description
 * @date 2020-10-29 11:17
 **/
public class Hello {

    @FunctionalInterface
    interface UserFactory<T extends User>{
        T create(String username);
    }

    private void test(){
        UserFactory<User> uf = User::new;
        List<User>  users = new ArrayList<>();
        for(int i = 0; i < 5; ++i){
            users.add(uf.create("user" + i));
        }
        users.stream().map(User::getUserName).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.test();
    }
}
