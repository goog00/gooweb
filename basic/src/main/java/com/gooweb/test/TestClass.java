package com.gooweb.test;

/**
 * @author steng
 * @description
 * @date 2020-01-09 10:15 上午
 **/
public class TestClass {



    public void add(Byte b){
        b = b++;
    }

    public void test(){
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.println(a + "");
        add(b);
        System.out.println(b + "");
    }

    public static void test2(int a){

        a++;
//        return a;
    }

    public static void main(String[] args) {
//        int a = 3;
//        System.out.println(a++);
//        System.out.println(a);
//        int b = 3;
//        System.out.println(++b);
//        System.out.println(b);
//
//        int c = 3;
//        test2(c);
//        System.out.println(c);
////        System.out.println(d);
//        String str = "444";
//        test3(str);
//        System.out.println(str);
//        int k = 3;
//
//        System.out.println(k);
//
//        test4(k);
//        int i = 0;
//        System.out.println(i++);
//        System.out.println(++i);

        Long a1 = 11L;
        Long a2 = 12L;
        String kkk = "" + a1 + a2 ;

        System.out.println(kkk);


    }
    public static  void test3(String str){
        //如果是按照引用传递
//        str = new String("33");
        System.out.println(str);

        float f = 45.0f;
        double d = 100;
        Object o = 'f';



    }

    public static void test4(int a){
        int  i, sum=0;
        for(i=0;i<10;++i,sum+=i);
        System.out.println("i" + i);
    }

}
