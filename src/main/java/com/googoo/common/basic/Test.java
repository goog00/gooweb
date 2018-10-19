package com.googoo.common.basic;


import org.apache.shiro.crypto.hash.Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    private String name ;

    static {
        System.out.println("static");
    }

    {
        name = "3333";
        System.out.println("dddddd");
    }

    public Test() {
        System.out.println("init");
    }

    public Test(String name) {
        System.out.println("===" + this.name);
        this.name = name;
    }

    public static void main(String[] args) throws Exception {
//        String str = new String("abc");
//        String str2 = "abc";
//        String str3 = "abc";
//        System.out.println(str == str2);
//        System.out.println(str3 == str2);
//
//        str.split("");
//
//        str.replace("a","G");
//        System.out.println(str);

//        String s = "Hello World";
//        System.out.println("s = " + s);
//
//        Field valueFieldOfString = String.class.getDeclaredField("value");
//        valueFieldOfString.setAccessible(true);
//        char[] value =(char[]) valueFieldOfString.get(s);
//        value[5] = '_';
//        System.out.println("s  = " + s);

//        {
//            byte[] placeholder = new byte[64 * 1024 * 1024];
//        }
//
//        int i;
//        System.gc();

//        final Map map = new HashMap();
//        final Test[] test = {null};
//        Thread thread1 = new Thread(new Runnable() {
//            public void run() {
//                test[0] = new Test();
//                map.put("q", test[0]);
//            }
//        });
//        Thread thread2 = new Thread(new Runnable() {
//            public void run() {
//                Test test = (Test) map.get("q");
//                System.out.println(3333);
//            }
//        });

//        List<Demo> list = new ArrayList<>();
//        for (int i = 0; i < 100000; i++){
//            Demo demo = new Demo();
//
//            demo.setId(i+"");
//            demo.setName("name" + i);
//            demo.setAge("10" + i);
//
//            list.add(demo);
//
//        }
//
//        Long start = System.currentTimeMillis();
//        Map<String, List<Demo>> collect = list.stream().collect(Collectors.groupingBy(Demo::getId));
//        Long end = System.currentTimeMillis();
//        System.out.println("-----list.stream()------时间 ： " + (end - start));
//        Map<String, List<Demo>> collect1 = list.parallelStream().collect(Collectors.groupingBy(Demo::getId));
//        long end2 = System.currentTimeMillis();
//        System.out.println("-----list.parallelStream() ----" + (end2 - end));
//
//        Map<String,Demo> map = new HashMap<>();
//        for(Demo demo : list){
//            map.put(demo.getId(),demo);
//        }
//        long end3 = System.currentTimeMillis();
//        System.out.println("------map------" + (end3 - end2));


        int k = 10;
        System.out.println(k / 3);
//        System.out.println(k % 3);


        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < 100; i++){
            list.add(i);
        }
        List<Integer> integers = list.subList(1, 10);
        System.out.println(integers);
        System.out.println(list.size());
        integers.clear();
//        System.out.println(list.size());
        System.out.println(list.subList(100,list.size()));

//        List<Integer> collect = list.parallelStream().filter(item -> (item / 4 == 0)).collect(Collectors.toList());
//        System.out.println("collect1" + collect.size());
//        System.out.println("结束");
//        System.out.println("collect2" + collect.size());

    }


}

class Demo{

    private String id;
    private String name;
    private String age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}