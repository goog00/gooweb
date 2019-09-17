package com.gooweb.leetcode.array;

/**
 * 344 翻转字符串
 * @author sunteng
 * @create 2019-09-17 上午 10:56
 **/
public class Solution_344 {

    public void reverseString(char[] s){
        int i = 0;
        int j = s.length - 1;
        while (i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
            i++;
        }
    }

    public static void main(String[] args) {
        Solution_344 solution_344 = new Solution_344();
        char[] str = new char[]{'h','e','l','l','o'};
        solution_344.reverseString(str);
        for(char s : str){
            System.out.println(s);
        }
    }
}
