package com.gooweb.interview;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                res.add(Math.abs(index + 1));
            }

            nums[index] = -nums[index];
        }
        return res;
    }

    public static int firstMissingPositive(int[] nums) {
        int length = nums.length;
        for(int i = 0; i< nums.length;i++){
            //如果在指定位置就不需要修改
            if(i + 1 == nums[i]){
                continue;
            }
            int t = nums[i];
            if(t >= 1 && t <= length && t != nums[t -1] ){
                swap(nums,i,t -1);
                //抵消上面的i++,如果交换之后 就不用i++
                i--;
            }
        }
        //最后在执行一遍循环,查看对应位置的元素是否正确,如果不正确直接返回
        for(int i = 0; i<nums.length; i++){
            if(i+1 != nums[i]){
                return i + 1;
            }
        }
        return length + 1;
    }

    private static void swap(int[] A,int i,int j){
        if(i != j){
            A[i] ^= A[j];
            A[j] ^= A[i];
            A[i] ^= A[j];
        }
    }


    public static void main(String[] args) {

        int[] nums = new int[]{1,2,0};
        int i = firstMissingPositive(nums);
        System.out.println(i);


    }
}