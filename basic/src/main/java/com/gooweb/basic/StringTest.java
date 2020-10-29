package com.gooweb.basic;

import com.gooweb.reflect.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author steng
 * @description
 * @date 2020-08-23 10:52 上午
 **/
public class StringTest {

    public static void main(String[] args) {
//        String str1 = new String("java");
//        String str2 = str1.intern();//
//        System.out.println(str1 == str1.intern());
//        System.out.println(str1 == str2);
//        test1();
//        test2();

        List<Apple> list = new ArrayList<>();
        list.add(null);

        List<Integer> allDirInodeIds = list.stream().map(Apple::getPrice).collect(Collectors.toList());


    }

    public static void test1() {

        //1.在堆中创建字符串对象(”计算机软件“)，str1引用指向它
        //2.str1.intern()法会判断字符串常量池中是否有”计算机软件“字符串，显然这里是没有的，需要在常量池中创建，怎么创建呢？
        //jdk7以后，字符串常量池移到堆中，intern()方法不需要拷贝字符串实例到常量池中了，只需要在常量池中记录一下首次出现的实例的引用，
        //因此str1.intern()返回的引用和str1都指向堆中的实例
        //3.因此，str1.intern() == str1 #true 相等
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);//true

        //1.加载类时，会在常量池中创建“数理化”对象
        //2.在堆中创建字符串对象(”数理化“)，str3引用指向它
        //3.intern() 方法会判断字符串常量池中是否有”数理化“字符串，显然这里是有的，直接返回第1步中”数理化“对象的引用
        //4.因此，str3.intern() == str3 #false 不相等
        String str3 = new String("数理化");


        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);//false
        String str5 = new String("数理化");
        System.out.println(str3.intern() == str5.intern());

    }


    public static void test2() {
        String str1 = "todo";
        String str2 = "todo";
        String str3 = "to";
        String str4 = "do";
        String str5 = str3 + str4;
        String str6 = new String(str1);

        System.out.println("------普通String测试结果------");
        System.out.print("str1 == str2 ? ");
        System.out.println(str1 == str2);
        System.out.print("str1 == str5 ? ");
        System.out.println(str1 == str5);
        System.out.print("str1 == str6 ? ");
        System.out.print(str1 == str6);
        System.out.println();

        System.out.println("---------intern测试结果---------");
        System.out.print("str1.intern() == str2.intern() ? ");
        System.out.println(str1.intern() == str2.intern());
        System.out.print("str1.intern() == str5.intern() ? ");
        System.out.println(str1.intern() == str5.intern());
        System.out.print("str1.intern() == str6.intern() ? ");
        System.out.println(str1.intern() == str6.intern());
        System.out.print("str1 == str6.intern() ? ");
        System.out.println(str1 == str6.intern());
        System.out.println(str6 == str6.intern());

    }
}
