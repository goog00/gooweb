package com.gooweb.leetcode.array;

import java.util.Arrays;

/**
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 * @author steng
 * @date 2020-11-30 10:57
 **/
public class Solution_628 {

    public static int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);


    }



    public static void main(String[] args) {
        int[] nums = new int[]{-20,-1,-9,-10};
        int max = maximumProduct(nums);
        System.out.println(max);
        for(int t : nums){
            System.out.println(t);
        }

    }
}
