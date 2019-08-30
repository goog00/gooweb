package com.gooweb.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 3.无重复字符的最长子串
 * @author sunteng
 * @create 2019-08-29 下午 8:14
 **/
public class Solution_3 {

    /**
     * 主要思路是滑动窗口
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s){
        int n = s.length();
        int ans = 0; //子串长度
        int left = 0;//记录子串的最左边字符的索引位置

        //key:字符值;value :字符值的索引+1;
        Map<Character,Integer> map = new HashMap<>();//当前索引的字符串值

        for(int j = 0; j < n;j++){
            if(map.containsKey(s.charAt(j))){
                //有重复的字符,则取当前重复字符的位置索引与left中的最大值
                left = Math.max(map.get(s.charAt(j)),left);
                //本来以为可以使用下面的代码来获取最左边字符位置;但是忽略了和其他字符子串长度进行比较;
//                left = map.get(s.charAt(j));

            }
            //(j - i + 1) 表示无重复子串的长度;每次保留最大的子串长度
            ans = Math.max(ans,j - left + 1);

            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution_3 solution_3 = new Solution_3();
        String kk = "abcabcbab";
        int i = solution_3.lengthOfLongestSubstring(kk);
        System.out.println(i);
    }

}
