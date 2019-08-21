package com.gooweb.leetcode.array;

/**
 * https://leetcode-cn.com/problems/move-zeroes/
 * 283 移动零
 * @author sunteng
 * @create 2019-08-21 上午 8:19
 **/
public class Solution_283 {


    public static void moveZeroes(int[] nums) {
        /**
         * 双指针
         * k 是慢指针
         * i 是快指针
         *
         */
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                swapArrays(nums,i, k++);
            }
        }
    }


    private static void swapArrays(int[] nums,int fast, int slow){
        if(fast == slow){
            //在没有遇到0的情况下，两个指针相同，当遇到0之后，fast 会大于slow,且slow指向0元素
            return;
        }
        // 把fast 和 slow 元素 调换顺序
        int temp = nums[fast];
        nums[fast] = nums[slow];
        nums[slow] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,0,5,0,6,9};

        moveZeroes(nums);

        for(int k : nums){
            System.out.println(k);
        }
    }

}
