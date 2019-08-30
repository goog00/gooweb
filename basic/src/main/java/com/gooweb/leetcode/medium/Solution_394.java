package com.gooweb.leetcode.medium;

import java.util.LinkedList;

/**
 * 字符串解码
 * https://leetcode-cn.com/problems/decode-string/solution/decode-string-fu-zhu-zhan-fa-di-gui-fa-by-jyd/
 * @author sunteng
 * @create 2019-08-30 上午 9:33
 **/
public class Solution_394 {

    public String decodeString(String s){

        StringBuilder res = new StringBuilder();
        int multi = 0;//重复次数
        LinkedList<Integer> stack_multi = new LinkedList<>();
        LinkedList<String> stack_res = new LinkedList<>();
        for(Character c : s.toCharArray()){
            if(c == '['){
                stack_multi.addLast(multi);
                stack_res.addLast(res.toString());

                multi = 0;
                res = new StringBuilder();
            } else if(c == ']'){
                StringBuilder tmp = new StringBuilder();
                int cur_multi = stack_multi.removeLast();
                for(int i = 0; i < cur_multi; i++){
                    tmp.append(res);
                }
                res = new StringBuilder(stack_res.removeLast() + tmp);
            } else if(c >= '0' && c <= '9'){
                multi = multi * 10 + Integer.parseInt(c + "");

            } else {
                res.append(c);
            }
        }

        return res.toString();

    }

    public static void main(String[] args) {
        Solution_394 solution_394 = new Solution_394();
        String kk = "3[a2[c]]";
        String s = solution_394.decodeString(kk);
        System.out.println(s);
    }


}
