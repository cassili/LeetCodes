package com.String.AddBinary67;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/2 22:32
 */

public class Solution {

    public static String addBinary(String a, String b) {

        int c = 0;
        StringBuilder sb = new StringBuilder("");

        // 能相加的位--相加
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 && j >= 0; i--, j--) {
            int a_num = a.charAt(i) - '0';
            int b_num = b.charAt(j) - '0';

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

        // 高位不能相加的保留下来，拼到前面
        String lowBits = null;
        if (a.length() - b.length() > 0) {  // a 长
            lowBits = LowBits(a, b, c, sb);
        } else if (a.length() == b.length()) {  // a 和 b 一样长
            if (c == 1) {
                sb.append('1');
            }
        } else {  // b 长
            lowBits = LowBits(b, a, c, sb);
        }

        return sb.reverse().toString();

    }

    public static String LowBits(String a, String b, int c, StringBuilder sb) {
        int j = a.length() - b.length() - 1;
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
        return sb.toString();
    }

    /**
     * 优秀解法
     *
     * @param a
     * @param b
     * @return
     */
    public String addBinary2(String a, String b) {
        char[] aArray = a.toCharArray(), bArray = b.toCharArray();
        StringBuilder sb = new StringBuilder();

        int i = aArray.length - 1, j = bArray.length - 1, carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = (i >= 0 ? aArray[i] - '0' : 0) + (j >= 0 ? bArray[j] - '0' : 0) + carry;

            sb.append(sum % 2);
            carry = sum / 2;

            if (i >= 0) i--;
            if (j >= 0) j--;
        }

        if (carry != 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();

    }


    public static void main(String[] args) {
        String a = "1011", b = "1110";
        System.out.println(addBinary(a, b));
    }
}
