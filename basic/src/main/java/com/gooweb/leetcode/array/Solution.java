package com.gooweb.leetcode.array;

/**
 * https://leetcode-cn.com/problems/plus-one/submissions/
 * @author sunteng
 * @create 2019-08-17 下午 6:55
 **/
class Solution {
    public static int[] plusOne(int[] digits) {
        for(int i =digits.length - 1; i>=0;i-- ){
            //最后一个元素加1
            digits[i]++;

            //判断最后一个元素加一之后是否需要进位，如果等于0，需要进位，然后循环处理下一个元素
            digits[i] = digits[i] % 10;
            if(digits[i] != 0) return digits;
        }
        //如果全部元素都需要进位，那么直接new 一个创建一个比原数组多出一位，且第一个元素为1的数组
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;


    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,9};
        plusOne(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
