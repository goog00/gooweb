package com.gooweb.jdk8;

import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author steng
 * @description
 * @date 2020-10-30 14:57
 **/
public class Test {

    public static void main(String[] args) {
        int size = 100000;
        //parallel:21841
        //stream  :158659

//        int size = 10000;
        //parallel:l652
        //stream  :280

        //parallel:4765
        //stream:3965


//        int size = 1000;
        //parallel:152
        //stream  :22
        //parallel:192
        //stream:104


        List<User> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            User user = new User();
            user.setScore(i);
            user.setUserName("zhangsan" + i);
            list.add(user);
        }

        long start = System.currentTimeMillis();

        Map<String, User> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
//
//            Map<String, User> KUnitIdVStudentMap = list
//                    .stream()
//                    .parallel()
//                    .collect(Collectors.toMap(User::getUserName,
//                            User -> User,
//                            (key1, key2) -> key2));

            User u = list.get(i);
            if (!map.containsKey(u.getUserName())) {
                map.put(u.getUserName(), u);
            }
        }
//
        long end = System.currentTimeMillis();
        System.out.println("parallel" + (end - start));

        long start1 = System.currentTimeMillis();
//        for (int i = 0; i < size; i++) {
        Map<String, User> KUnitIdVStudentMap = list
                .stream()
                    .parallel()
                .collect(Collectors.toMap(User::getUserName,
                        User -> User,
                        (key1, key2) -> key2));
//        }
        long end1 = System.currentTimeMillis();

        System.out.println("stream" + (end1 - start1));
    }


    @Data
    static class User {

        private String userName;

        private Integer score;

    }

}