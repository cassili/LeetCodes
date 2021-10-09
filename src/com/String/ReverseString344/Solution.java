package com.String.ReverseString344;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/7 12:57
 */

public class Solution {

    /**
     * 方法一
     *
     * @param s
     */
    public static void reverseString1(char[] s) {
        int len = s.length;
        for (int i = 0; i < len / 2; i++) {
            char temp = s[len - i - 1];
            s[len - i - 1] = s[i];
            s[i] = temp;
        }

    }

    /**
     * 方法二
     *
     * @param s
     */
    public static void reverseString2(char[] s) {

        StringBuilder sb = new StringBuilder(new String(s));

        sb.reverse();

        int i = 0;
        for (char c : sb.toString().toCharArray()) {
            s[i++] = c;
        }

    }

    public static void main(String[] args) {
        char[] s = new char[5];
        s[0] = 'h';
        s[1] = 'e';
        s[2] = 'l';
        s[3] = 'l';
        s[4] = 'o';
        reverseString2(s);
    }
}
