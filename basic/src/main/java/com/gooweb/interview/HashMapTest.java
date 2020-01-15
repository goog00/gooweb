package com.gooweb.interview;


import java.util.HashMap;
import java.util.Map;

/**
 * @author steng
 * @description
 * @date 2019-12-23 9:59 上午
 **/
public class HashMapTest {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        Map<String,String> hashMap = new HashMap<>();
        for(int i = 0; i < 20;i++){
            hashMap.put("sun" + i,"teng" + i);
        }

        String value = hashMap.get("sun2");


        int k = 16;
        int k2 = 15;

        int tt = k % k2;

        System.out.println(tt);

        Integer v = 16;
        Integer v2 = 15;

        System.out.println(v & v2);

        String s = Integer.toBinaryString(16);
        String s1 = Integer.toBinaryString(15);



    }
}
