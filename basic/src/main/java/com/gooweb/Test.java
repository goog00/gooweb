package com.gooweb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @author sunteng
 * @create 2019-08-13 下午 10:39
 **/
public class Test {

    public static void main(String[] args) throws Exception {
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


//        String str = "test";
//        String str2 = "test";
//        System.out.println(str == str2);
//
//        String str3 = new String("test");
////        System.out.println(str == str3);
//
//        String str4 = str3.intern();
//
//        String str5 = "test";
//        System.out.println(str5 == str4);



        List<String> list = new ArrayList<>();

        for(int i = 0; i< 10000; i++){
            list.add("123"+ i);
        }



        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            if(next.equals("123100")){
                iterator.remove();
//                list.remove("123100");

            }
        }
//
//        for(String str : list){
//            list.remove(str);
//        }
//
//        LinkedList<String> list2 = new LinkedList<>();
//        list2.add("dddd");
//        list2.offer("333");
//        System.out.println();

        String path = "/Users/steng/myworkspace/codes/private/2019/gooweb/basic/src/main/java/com/gooweb/操作系统/线程/线程";
        InputStream inputStream = new FileInputStream(path);
        byte[] arr = new byte[10];
        int read = inputStream.read(arr);
        System.out.println(new String(arr));


    }



    class User{

        public User(String name){

            name = name;
        }

        public User(String name,Integer d){
            this(name);
        }
        String name;

        public String getName() {
            return name;
        }

        public final void setName(String name) {

            this.name = name;
        }
    }
}
