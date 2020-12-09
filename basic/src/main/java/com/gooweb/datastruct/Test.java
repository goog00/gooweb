package com.gooweb.datastruct;

import java.util.ArrayList;
import java.util.List;

/**
 * @author steng
 * @date 2020-11-26 19:33
 **/
public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("22");

        list.stream().filter(item->item != null).forEach(item->{
            System.out.println(item);
        });

        for(String st : list){
            System.out.println(st);
        }
    }
}
