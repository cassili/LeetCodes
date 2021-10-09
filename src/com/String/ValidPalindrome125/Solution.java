package com.String.ValidPalindrome125;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/5 23:55
 */

public class Solution {

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^0-9A-Za-z]", "").toLowerCase();
        int i = 0, j = s.length() - 1;
        System.out.println(s);
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = "Damosel, a poem? A carol? Or a cameo pale? (So mad!)";
//        System.out.println(isPalindrome(s1));  // true
//        System.out.println(isPalindrome(s2));  // false
        System.out.println(isPalindrome(s3));  // false


    }
}
