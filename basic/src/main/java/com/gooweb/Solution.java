package com.gooweb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    /**
     * Return a list of the words in words that match the given pattern.
     *
     * A word matches the pattern if there exists a permutation of
     * letters p so that after replacing every letter x in the pattern
     * with p(x), we get the desired word.
     *
     * Example:
     *     Input: words = ["abc","deq","mee","aqq","dkd","ccc"],
     *            pattern = "abb"
     *     Output: ["mee","aqq"]
     *
     *     Explanation: "mee" matches the pattern because there is
     *         a permutation {a -> m, b -> e, ...}.
     *
     *        "ccc" does not match the pattern because
     *        {a -> c, b -> c, ...} is not a permutation, since a
     *        and b map to the same letter.
     */
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for (String word: words) {
            if (match(word, pattern)) {
                ans.add(word);
            }
        }

        return ans;
    }

    public boolean match(String word, String pattern) {
        Map<Character, Character> M = new HashMap();
        for (int i = 0; i < word.length(); ++i) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            if (!M.containsKey(w)) M.put(w, p);
            if (M.get(w) != p) return false;
        }
        boolean[] seen = new boolean[26];
        for (char p: M.values()) {
            if (seen[p - 'a']) return false;
            seen[p - 'a'] = true;
        }
        return true;
    }
}