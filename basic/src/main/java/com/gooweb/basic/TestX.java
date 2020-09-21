package com.gooweb.basic;

/**
 * @author steng
 * @description
 * @date 2020-08-09 3:20 下午
 **/
public class TestX {

//    static {
//        System.out.println("TestX");
//    }
//
//    public TestX(){
//        System.out.println("TestX()");
//    }
//
//    public static void test(){
//        System.out.println("test()");
//    }

    public static void main(String[] args) {

        String a = "abc";
        String b = "abc";
        String d = "abc" + "abc";
        String e = "abc" + "bc" + a;
        String c = "abcabc";
        String a1 = "a";
        String f = a1 + "bc";
        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(a==c);
        System.out.println(a==f.intern());
        System.out.println(d == c);





    }
}
