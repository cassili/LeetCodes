package com.String.LengthOfLastWord58;


/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/2 22:19
 */

public class Solution {

    /**
     * 自己做的
     *
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {

        String[] s1 = s.trim().split(" ");

        return s1[s1.length - 1].length();

    }

    /**
     * 参考答案
     *
     * @param s
     * @return
     */
    public static int lengthOfLastWord2(String s) {

        int length = 0;
        int tail = s.length() - 1;

        while (tail >= 0 && s.charAt(tail) == ' ') {
            tail--;
        }

        while (tail >= 0 && s.charAt(tail) != ' ') {
            tail--;
            length++;
        }

        return length;

    }


    public static void main(String[] args) {

        String s = "   fly me   to   the moon  ";

        System.out.println(lengthOfLastWord2(s));
    }
}
