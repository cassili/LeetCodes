package com.LongestPalindrome409;

import java.util.HashMap;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/9 19:42
 */

public class Solution {

    /**
     * Runtime: 4 ms, faster than 56.34% of Java online submissions for Longest Palindrome.
     * Memory Usage: 38 MB, less than 52.36% of Java online submissions for Longest Palindrome.
     *
     * @param s
     * @return
     */
    public static int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int len = 0;
        int len_2 = 0;
        for (Character key : map.keySet()) {
            int value = map.get(key);
            if (value / 2 != 0) {
                if (value % 2 == 1 && len_2 == 0) {
                    len_2 += 1;
                }
                len += value / 2 * 2;
            } else if (len_2 == 0) {
                len_2 += 1;
            }
        }

        return len_2 == 0 ? len : len + len_2;

    }

    public static void main(String[] args) {
        String s = "bananas";
        System.out.println(longestPalindrome(s));
    }
}
