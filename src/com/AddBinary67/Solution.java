package com.AddBinary67;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/2 22:32
 */

public class Solution {

    public static String addBinary(String a, String b) {

        int c = 0;
        StringBuffer sb = new StringBuffer("");

        // 能相加的位--相加
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 && j >= 0; i--, j--) {
            int a_num = a.charAt(i) -'0';
            int b_num = b.charAt(j) -'0';

            if (a_num + b_num + c == 0) {
                c = 0;
                sb.append('0');
            } else if (a_num + b_num + c == 1) {
                c = 0;
                sb.append('1');
            } else if (a_num + b_num + c == 2) {
                c = 1;
                sb.append('0');
            } else {
                c = 1;
                sb.append('1');
            }

        }

        System.out.println(c);

        // 高位不能相加的保留下来，拼到前面
        int a_len = a.length();
        int b_len = b.length();
        int j = 0;
        if (a_len - b_len > 0) {  // a 长
            j = a_len - b_len - 1;
            // 能相加的位--相加
            for (; j >= 0; j--) {
                int a_num = a.charAt(j) - '0';
                if (a_num + c == 0) {
                    c = 0;
                    sb.append('0');
                } else if (a_num + c == 1) {
                    c = 0;
                    sb.append('1');
                } else {
                    c = 1;
                    sb.append('0');
                }

            }
            if (c == 1) {
                sb.append('1');
            }

        } else if (a_len == b_len) {  // a 和 b 一样长
            if (c == 1) {
                sb.append('1');
            }
        } else {  // b 长
            j = b_len - a_len - 1;
            // 能相加的位--相加
            for (; j >= 0; j--) {
                int b_num = b.charAt(j) - '0';
                if (b_num + c == 0) {
                    c = 0;
                    sb.append('0');
                } else if (b_num + c == 1) {
                    c = 0;
                    sb.append('1');
                } else {
                    c = 1;
                    sb.append('0');
                }

            }
            if (c == 1) {
                sb.append('1');
            }
        }

        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        String a = "1011", b = "111";
        System.out.println(addBinary(a, b));
    }
}
