package com.gooweb.leetcode.array;

/**
 * 169 求众数 Boyer-Moore 投票算法
 * https://leetcode-cn.com/problems/majority-element/solution/qiu-zhong-shu-by-leetcode-2/
 * @author sunteng
 * @create 2019-08-25 上午 8:36
 **/
public class Solution_169_2 {


    public static int majorityElement(int[] nums) {

        int count = 0;
        Integer candidate = null;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
//            count += ((num == candidate) ? 1 : -1);

            if(num == candidate){
                count += 1;
            } else {
                count += -1;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{6,5,5};
        int i = majorityElement(nums);
        System.out.println(i);
    }
}
