package com.gooweb.leetcode.array;

/**
 * 283 移动零
 * @author sunteng
 * @create 2019-08-21 上午 8:41
 **/
public class Solution_283_2 {

    public static void moveZeroes(int[] nums) {

        /**
         * 把非零元素前移，最后补零；
         * i 慢指针，
         * j 循环指针
         */
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }
        for(int k = i; k < nums.length;k++){
            nums[k] = 0;
        }

    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,3,0,5,0,6,9};

        moveZeroes(nums);

        for(int k : nums){
            System.out.println(k);
        }
    }
}
