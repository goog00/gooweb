package com.gooweb.test;

/**
 * @author steng
 * @description
 * @date 2020-03-13 6:50 下午
 **/
public class TestInteger {

    public static void main(String[] args) {

        //包装类的 "==" 运算在遇到算术运算的情况下回自动拆箱
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d);//true
        System.out.println(e == f);// false
        System.out.println(c == (a + b)); // true
        System.out.println(c.equals(a + b)); // true
        System.out.println(g == (a + b)); // true
        System.out.println(g.equals(a + b)); //false
    }
}
