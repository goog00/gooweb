package com.gooweb.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 3.无重复字符的最长子串
 * @author sunteng
 * @create 2019-08-29 下午 8:14
 **/
public class Solution_3 {

    public int lengthOfLongestSubstring(String s){
        int n = s.length(),ans = 0;
        Map<Character,Integer> map = new HashMap<>();//当前索引的字符串值

        for(int j = 0, i = 0; j < n;j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)),i);
            }
            ans = Math.max(ans,j - i + 1);//(j - i + 1) 表示子串的长度
            map.put(s.charAt(j), j+ 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution_3 solution_3 = new Solution_3();
        String kk = "abcabcbb";
        int i = solution_3.lengthOfLongestSubstring(kk);
        System.out.println(i);
    }

}
