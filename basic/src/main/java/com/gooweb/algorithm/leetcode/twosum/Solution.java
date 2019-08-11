package com.gooweb.algorithm.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * @author sunteng
 * @create 2019-08-11 下午 6:40
 **/
public class Solution {

    /**
     * 暴力法
     * 遍历每个元素x
     * 时间复杂度分析
     * 时间复杂度：O(n2)
     * 空间复杂度：O(1)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twosum(int[] nums,int target){
        for(int i = 0; i < nums.length; i++){

            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("no two sum solution");

    }


    /**
     * 两边哈希表
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twosum2(int[] nums,int target){

        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
        }

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[]{i,map.get(complement)};
            }
        }

        throw new IllegalArgumentException("no two sum solution");


    }

    public static int[] twosum3(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no two sum solution");

    }

    private static void test(String method){
        int[] twosum = null;
        int[] arr = new int[]{1,2,3,4,5,6,7};
        if(method.equals("twosum")){
            twosum = twosum(arr, 3);
        } else if(method.equals("twosum2")){
            twosum = twosum2(arr, 3);
        } else {
            twosum = twosum3(arr, 3);
        }

        System.out.println(twosum[0]);
        System.out.println(twosum[1]);
    }

    public static void main(String[] args) {
        test("twosum3");
    }
}
