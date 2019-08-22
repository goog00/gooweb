package com.gooweb.leetcode.array;

import java.util.HashMap;
import java.util.Stack;

/**
 * 20. 有效的括号
 * https://leetcode-cn.com/problems/valid-parentheses/solution/you-xiao-de-gua-hao-by-leetcode/
 * @author sunteng
 * @create 2019-08-22 下午 2:23
 **/
public class Solution_20 {

    private HashMap<Character,Character> mappings;

    public Solution_20(){
        //初始化数据
        //map 存储：key-->反；value --->正
        this.mappings = new HashMap<>();
        this.mappings.put(')','(');
        this.mappings.put('}','{');
        this.mappings.put(']','[');
    }

    public boolean isValid(String s){
        //使用栈存储，后进先出； 栈内存储的都是正向符号
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(this.mappings.containsKey(c)){
                //循环字符中字符，处理反向符号
                //取出栈顶元素
                char topElement = stack.empty() ? '#' : stack.pop();
                if(topElement != this.mappings.get(c)){
                    //使用当前字符串的char
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution_20 solution_20 = new Solution_20();
        String str = "({)}[]";
        boolean valid = solution_20.isValid(str);
        System.out.println(valid);
    }
}
