package com.gooweb.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author steng
 * @date 2020-11-24 10:44
 **/
public class Ddd extends Son{

//    @Override
//    public void test2(){
//        System.out.println("Ddd 实现");
//    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("123A");
        list.add("B");
        list.add("C");

        long count = list.stream().filter(item -> item.equals("123A"))
                .filter(item -> item.equals("B"))
                .filter(item -> item.equals("C"))
                .count();
        System.out.println(count);

    }
}
