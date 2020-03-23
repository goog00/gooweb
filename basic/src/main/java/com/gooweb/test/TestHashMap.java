package com.gooweb.test;

import com.gooweb.interview.HashMapTest;

import java.util.HashMap;
import java.util.UUID;

/**
 * @author steng
 * @description
 * @date 2020-02-24 10:46 上午
 **/
public class TestHashMap {


    public static void main(String[] args) throws InterruptedException {

        final HashMap<String,String> map = new HashMap<>(2);

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ;i < 1000000; i++){
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            map.put(UUID.randomUUID().toString(),"");
                        }
                    },"ftf" + i).start();
                }
            }
        },"ftf");
        t.start();
        t.join();
        System.out.println("#####");

    }
}
