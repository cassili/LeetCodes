package com.ReverseVowelsofAString345;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/7 13:22
 */

public class Solution {

    public static String reverseVowels(String s) {

        char[] charArray = s.toCharArray();
        int i = 0, j = charArray.length - 1;
        boolean i_flag = false;
        boolean j_flag = false;

        while (i < j) {
            if (!(charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u' || charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I' || charArray[i] == 'O' || charArray[i] == 'U')) {
                i++;
                i_flag = false;
            } else {
                i_flag = true;
            }
            if (!(charArray[j] == 'a' || charArray[j] == 'e' || charArray[j] == 'i' || charArray[j] == 'o' || charArray[j] == 'u' || charArray[j] == 'A' || charArray[j] == 'E' || charArray[j] == 'I' || charArray[j] == 'O' || charArray[j] == 'U')) {
                j--;
                j_flag = false;
            } else {
                j_flag = true;
            }
            if (i_flag && j_flag) {
                char temp = charArray[j];
                charArray[j--] = charArray[i];
                charArray[i++] = temp;
            }
        }

        return String.valueOf(charArray);

    }

    public static void main(String[] args) {
        String s = "aA";
        System.out.println(reverseVowels(s));
    }
}
