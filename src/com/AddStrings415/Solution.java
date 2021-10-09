package com.AddStrings415;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/9 20:34
 */

public class Solution {

    /**
     * Runtime: 4 ms, faster than 36.95% of Java online submissions for Add Strings.
     * Memory Usage: 41 MB, less than 5.83% of Java online submissions for Add Strings.
     *
     * @param num1
     * @param num2
     * @return
     */
    public static String addStrings(String num1, String num2) {
        int c = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 && j >= 0; i--, j--) {
            int c_num1 = num1.charAt(i) - '0';
            int c_num2 = num2.charAt(j) - '0';
            String c_char = String.valueOf(c_num1 + c_num2 + c);
            char c_sum = c_char.charAt(c_char.length() - 1);
            c = 0;
            if (c_char.length() > 1) {
                c += 1;
            }
            sb.append(c_sum);
        }

        if (num1.length() == num2.length()) {
            if (c == 1) {
                sb.append('1');
            }
        }

        if (num1.length() > num2.length()) {
            StringBuilder stringBuilder = sum_part(num1, num2, c, sb);
        } else if (num2.length() > num1.length()) {
            StringBuilder stringBuilder = sum_part(num2, num1, c, sb);
        }

        return sb.reverse().toString();

    }

    public static StringBuilder sum_part(String num1, String num2, int c, StringBuilder sb) {
        int cnt = num1.length() - num2.length();
        String s = num1.substring(0, cnt);
        for (int i = s.length() - 1; i >= 0; i--) {
            String s_p = String.valueOf(s.charAt(i) - '0' + c);
            sb.append(s_p.charAt(s_p.length() - 1));
            if (s_p.length() != 1) {
                c = 1;
            } else {
                c = 0;
            }
        }
        if (c == 1) {
            sb.append('1');
        }
        return sb;
    }

    /**
     * Runtime: 2 ms, faster than 91.27% of Java online submissions for Add Strings.
     * Memory Usage: 39.5 MB, less than 28.86% of Java online submissions for Add Strings.
     *
     * @param num1
     * @param num2
     * @return
     */
    public String addStrings2(String num1, String num2) {

        StringBuffer sb = new StringBuffer();

        int end1 = num1.length() - 1, end2 = num2.length() - 1, carry = 0, sum = 0;

        int maxLength = num1.length() >= num2.length() ? num1.length() : num2.length();

        while (maxLength > 0) {

            if (end1 >= 0) {
                sum = sum + num1.charAt(end1--) - '0';
            }

            if (end2 >= 0) {
                sum = sum + num2.charAt(end2--) - '0';
            }

            sum = sum + carry;

            sb.append(sum % 10);
            carry = sum / 10;

            sum = 0;
            maxLength--;
        }

        if (carry == 1) {
            sb.append(1);
        }

        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        String num1 = "1", num2 = "9";
        System.out.println(addStrings(num1, num2));
    }
}
