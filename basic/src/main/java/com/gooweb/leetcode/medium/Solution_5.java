package com.gooweb.leetcode.medium;

/**
 * 5.最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * https://leetcode-cn.com/problems/longest-palindromic-substring/
 * @author sunteng
 * @create 2019-08-26 下午 9:00
 **/
public class Solution_5 {

    private int lo,maxLen;

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len-1; i++) {
            extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
            extendPalindrome(s, i, i+1); //assume even length.
        }
        return s.substring(lo, lo + maxLen);
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }

    public static void main(String[] args) {
        Solution_5 solution_5 = new Solution_5();
        String ss = "babad";
        String s = solution_5.longestPalindrome(ss);
        System.out.println(s);
    }
}
