package com.gooweb;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @author sunteng
 * @create 2019-08-13 下午 10:39
 **/
public class Test {

    public static void main(String[] args) {
//        String  k = "kio";;
//        System.out.println(k.replaceAll("\\*",""));
//
//        String str = null;
//        if( 1==1 & str.equals("1")){
//            System.out.println("&");
//        }
//
//        if(1==1 && str.equals("1")){
//            System.out.println("&&");
//        }
//
//
//        short s1 = 1;
//        s1 = (short) (s1 + 1);
//        s1 += 1;


//        double du = -11.6d;
//        double ceil = Math.ceil(du);
//        double floor = Math.floor(du);
//        long round = Math.round(du);
//        System.out.println(ceil);
//        System.out.println(floor);
//        System.out.println(round);


//        List<User> list = new ArrayList<>();
//
//        Map<String, List<User>> collect = list.stream().collect(Collectors.groupingBy(User::getName));
//        List<User> users = collect.get("33");
//        System.out.println(users);






    }

    class User{
        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
