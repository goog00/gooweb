package com.gooweb.leetcode.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 169 求众数
 * 哈希表法
 * @author sunteng
 * @create 2019-08-25 上午 8:19
 **/
public class Solution_169 {

    public static  int majorityElement(int[] nums) {

        int majorityNum = nums.length / 2;
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for(int k : nums){
            Integer tmp = map.get(k);
            if(tmp != null){
                map.put(k,++tmp);
            } else {
                map.put(k,1);
            }
        }

        Set<Integer> integers = map.keySet();
        for(Integer k : integers){
            Integer integer = map.get(k);
            if(integer > majorityNum){
                return k;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3};
        int i = majorityElement(nums);
        System.out.println(i);
    }

}
