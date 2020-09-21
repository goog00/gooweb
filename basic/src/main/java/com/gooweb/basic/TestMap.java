package com.gooweb.basic;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author steng
 * @description
 * @date 2020-06-17 11:11 上午
 **/
public class TestMap {

    public static void main(String[] args) {

        ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();

        String put = map.put("key", "test");
        System.out.println(put);
        map.size();
        String key = map.get("key");
        System.out.println(key);


    }
}
