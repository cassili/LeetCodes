package com.IsSubsequence392;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/8 11:46
 */

/**
 * Runtime: 1 ms, faster than 83.11% of Java online submissions for Is Subsequence.
 * Memory Usage: 37.4 MB, less than 48.31% of Java online submissions for Is Subsequence.
 */
public class Solution {
    public static boolean isSubsequence(String s, String t) {

        for (Character c : s.toCharArray()) {
            boolean flag = false;
            for (int i = 0; i < t.length(); i++) {
                if (t.charAt(i) == c) {
                    t = t.substring(i + 1, t.length());
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
