package com.String.RepeatedSubstringPattern459;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/9 22:01
 */

public class Solution {

    public static boolean repeatedSubstringPattern(String s) {

        /**
         * Runtime: 4 ms, faster than 98.66% of Java online submissions for Repeated Substring Pattern.
         * Memory Usage: 39.5 MB, less than 61.13% of Java online submissions for Repeated Substring Pattern.
         */
        char[] chars = s.toCharArray();
        int n = chars.length;

        for (int size = 1; size <= n / 2; size++) {
            if (n % size != 0) {
                continue;
            }
            boolean found = true;
            for (int i = 0, j = i + size; j < n; ++i, ++j) {
                if (chars[i] != chars[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String s = "abab";
        System.out.println(repeatedSubstringPattern(s));


    }
}
