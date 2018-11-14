package com.googoo.common.fanxing;

import java.util.ArrayList;

/**
 * @author sunteng
 * @create 2018-11-11 上午 9:46
 **/
public class Test {
    public static void main(String[] args) {

        ArrayList<Apple> list = new ArrayList<>();
        list.add(new Apple());
        list.add(new Apple());

        print(list);

    }

    public static  void print(ArrayList<? extends Fruit> list){
        for(Fruit e : list){
            System.out.print(e);
        }
    }
}
