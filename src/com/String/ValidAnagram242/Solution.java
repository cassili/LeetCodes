package com.String.ValidAnagram242;

import java.util.Arrays;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/7 12:04
 */

public class Solution {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        int j = 0;
        while (j < sArray.length) {
            if (sArray[j] != (tArray[j])) {
                return false;
            }
            j++;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "art", t = "rat";
        System.out.println(isAnagram(s, t));

    }
}
