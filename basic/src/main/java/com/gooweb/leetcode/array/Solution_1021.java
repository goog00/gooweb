package com.gooweb.leetcode.array;

import java.util.Stack;

/**
 * @author sunteng
 * @create 2019-09-17 上午 11:32
 **/
public class Solution_1021 {

    public String removeOuterParentheses(String s){

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int start = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            } else {
                stack.pop();
                if(stack.isEmpty()){
                    sb.append(s.substring(start + 1,i));
                    start = i +1;
                }
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "((()))()";
        Solution_1021 solution_1021 = new Solution_1021();
        String s1 = solution_1021.removeOuterParentheses(s);
        System.out.println(s);
        System.out.println(s1);
    }
}
