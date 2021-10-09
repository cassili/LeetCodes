package com.String.ImplementStrStr28;


/**
 * @Description: Example 1:
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * <p>
 * Example 2:
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * <p>
 * Example 3:
 * Input: haystack = "", needle = ""
 * Output: 0
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/2 22:09
 */

public class Solution {

    public static int strStr(String haystack, String needle) {

        int result = 0;
        if (needle == null) {
            result = 0;
        }

        if (haystack.contains(needle)) {
            result = haystack.indexOf(needle);
        } else {
            result = -1;
        }
        return result;
    }

    public static void main(String[] args) {
        String haystack = "abc";
        String needle = "c";
        System.out.println(strStr(haystack, needle));

    }
}
