package com.gooweb.leetcode.array;


/**
 *  1021 remove outermost parentheses
 * https://leetcode.com/problems/remove-outermost-parentheses/discuss/308161/Java-in-6-lines
 * @author sunteng
 * @create 2019-09-17 下午 12:40
 **/
public class Solution_1021_1 {

    public  String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '(' && count++ > 0){
                sb.append(c);
            }

            if(c == ')' && --count > 0){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution_1021_1 solution = new Solution_1021_1();
        String s = "(()())";
        String s1 = solution.removeOuterParentheses(s);
        System.out.println(s);
        System.out.println(s1);
    }
}
