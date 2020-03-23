package com.gooweb.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author steng
 * @description
 * @date 2020-01-09 9:56 上午
 **/
public class X extends TestClass {
    String name;




    public static void main(String[] args){
        String k = "java";
        k = "go";
        test(k);
        System.out.println(k);


        List<String> a = new ArrayList<>();
        a.add("2");
        test2(a);
        System.out.println();
        for (String a1 : a) {
            System.out.println(a1);
        }

        int o = 22;
        test3(o);
        System.out.println(o);

        int i = 7;
        System.out.println(--i);
        System.out.println(i);


    }

    public static void test(String k){

        k = "p";
    }
    public static void test3(int k){

        k = 4;
    }

    public static void test2(List<String> a){
        a = new ArrayList<>();
        a.add("3");

    }






}
