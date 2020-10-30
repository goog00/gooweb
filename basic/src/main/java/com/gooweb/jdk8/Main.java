package com.gooweb.jdk8;

import java.util.Arrays;
import java.util.List;

/**
 * @author steng
 * @description
 * @date 2020-10-29 11:10
 **/
public class Main {

    public static void main(String[] args) {
        Person h = str -> System.out.println(str);
        h.say("hello world");


       List<String> strs =  Arrays.asList("aa","bb","cc");
       strs.forEach(System.out::println);
    }
}
