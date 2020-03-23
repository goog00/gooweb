package com.gooweb.test;

/**
 * @author steng
 * @description
 * @date 2020-03-12 10:33 上午
 **/
public class TestString {

    public static final String A;
    public static final String B;

    static {
        A = "ab";
        B = "cd";
    }

    public static void main(String[] args) {
        String s = A + B;
        String t = "abcd";
        if(s == t){
            System.out.println("s==t");

        } else {
            System.out.println("s!=t");

        }

        String k = "jm2";
        String k2 = "m";
        String k22 = "jm2" + "m";
        String k3 = k + k2;
        String k4 = "jm2m";
        System.out.println(k3 == k4);
        System.out.println(k22 == k4);
    }
}
