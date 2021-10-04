package com.AddBinary67;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/2 22:32
 */

public class Solution {

    public static String addBinary(String a, String b) {

        int i = Math.min(a.length(), b.length()) - 1;
        char c = '0';
        StringBuffer sb = new StringBuffer("");


        // 能相加的位--相加
        for (; i >= 0; i--) {
            int a_num = a.charAt(i) - '0';
            int b_num = b.charAt(i) - '0';
            if (a_num + b_num + c == 0) {
                c = '0';
                sb.append('0');
            } else if (a_num + b_num + c == 1) {
                c = '0';
                sb.append('1');
            } else if (a_num + b_num + c == 2) {
                c = '1';
                sb.append('0');
            } else {
                c = '1';
                sb.append('1');
            }

        }

        // 高位不能相加的保留下来，拼到前面
        int a_len = a.length();
        int b_len = b.length();
        int l_len = 0;

        if (a_len - b_len > 0) {  // a 长
//            sb.append()

        } else if (a_len == b_len) {  // a 和 b 一样长
            if (c == '1') {
                sb.append('1');
            }
        } else {  // b 长
            l_len = b_len - a_len;
        }

        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        String a = "11", b = "1";
        System.out.println(addBinary(a, b));
    }
}
