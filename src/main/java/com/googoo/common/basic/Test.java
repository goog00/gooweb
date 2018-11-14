package com.googoo.common.basic;


import java.util.*;

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


//        int k = 10;
//        System.out.println(k / 3);
//        System.out.println(k % 3);
//
//List<Integer> list2 = new ArrayList<>();
//
//        List<Integer> list = new ArrayList<>();
//        for(int i = 0 ; i < 100; i++){
//            list.add(i);
//        }
//
//        list2.addAll(list);
////        list.clear();
//        list = null;
//        System.out.println(list2.size());

//        Demo demo = new Demo();
////        demo.setList(list);
//        System.out.println(list.size());
////        list.clear();
//        System.out.println(demo.getList().size());
//        demo = null;

//        List<Integer> integers = list.subList(1, 10);
////        System.out.println(integers);
//        System.out.println(list.size());
//        integers.clear();
//        System.out.println(list.size());

//        List<Integer> collect = list.parallelStream().filter(item -> (item / 4 == 0)).collect(Collectors.toList());
//        System.out.println("collect1" + collect.size());
//        System.out.println("结束");
//        System.out.println("collect2" + collect.size());


//        String date = "2018-10-10 00:00:00";
//        SimpleDateFormat instance = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date parse = instance.parse(date);
//
//        System.out.println(parse);

//        Test2 test2 = new Test2();
//        Demo demo = test2.create();
//        System.out.println(demo);
//        demo = null;
//        System.out.println(demo);
//        System.out.println(test2.getDemo().getList());
////        test2.getDemo().getList().clear();
//        System.out.println(test2.getDemo().getList());


        int k = 1;
        k--;
//        System.out.println(k);
//        --k;
        System.out.println(k);
        System.out.println(k>0);





    }

    private void set(Demo demo ,List<Integer> list){
        demo.setList(list);
        List<Integer> list1 = new ArrayList<>();
        for(Integer integer1 : list){
            list1.add(integer1);
        }
        demo.setList(list1);
    }


    private static  Demo get(){
        return new Demo();
    }


}



class Demo{

    private String id;
    private String name;
    private String age;

    List<Integer> list;

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

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }
}