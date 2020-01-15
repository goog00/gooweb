package com.gooweb.interview;

/**
 * @author steng
 * @description
 * @date 2020-01-08 2:56 下午
 **/
public class StringIntern {


    final static int hehehe = 1;
    final static int java = 1;
    final static int qwjava = 1;
    final static int qwqwqw = 1;


    /**
     * https://www.journaldev.com/7929/java-string-intern
     *
     * String intern() Example Explanation
     *
     * 1.When we are using new operator, the String is created in the heap space. So “s1” object is created in the heap memory with value “abc”.
     * 2.When we create string literal, it’s created in the string pool. So “s2” and “s3” are referring to string object in the pool having value “abc”.
     * 3.In the first print statement, s1 and s2 are referring to different objects. Hence s1==s2 is returning false.
     * 4.In the second print statement, s2 and s3 are referring to the same object in the pool. Hence s2==s3 is returning true.
     * 5.Now, when we are calling s1.intern(), JVM checks if there is any string in the pool with value “abc” is present? Since there is a string object in the pool with value “abc”, its reference is returned.
     * 6.Notice that we are calling s1 = s1.intern(), so the s1 is now referring to the string pool object having value “abc”.
     * 7.At this point, all the three string objects are referring to the same object in the string pool. Hence s1==s2 is returning true now.
     *
     */
    public static void main(String[] args) {

//        String s1 = new String("abc");//在堆内存年轻代中创建对象实例,方法区s1变量指向堆内存中的"abc"实例
//
//        s1 = s1.intern();
//        String s2 = "abc";//在常量池中创建对象"abc"
//        String s3 = "abc";//在常量池中创建对象"abc"
//
//        String s4 = new String("abc");
//
//
//        System.out.println("s1==s2 #" + (s1 == s2));
//        System.out.println("s2==s3 #" + (s2 == s3));
//        System.out.println("s3==s4 #" + (s4 == s3));
//
//
//        s1 = s1.intern();
//        System.out.println("s1==s2 #" + (s1 == s2));


//        String s5 = new String("hehe") + new String("he");
//        System.out.println(s5.intern() == s5);//true
//
//        String s6 = new String("qwj") + new String("ava");
//        System.out.println(s6.intern() == s6);//true
//
//        String s8 = new String("j") + new String("ava");
//        System.out.println(s8.intern() == s8);//false,不知道为什么
//
//        String s7 = new String("qwqw") + new String("qw");
//        System.out.println(s7.intern() == s7);//true


        String s = new String("1");
        String s2 = "1";
        s.intern();
        System.out.println(s == s2);

        String s3 = new String("1") + new String("1");
        String s4 = "11";
        s3.intern();
        System.out.println(s3 == s4);




    }
}
