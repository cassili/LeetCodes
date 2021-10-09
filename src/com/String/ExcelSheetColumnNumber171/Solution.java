package com.String.ExcelSheetColumnNumber171;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/6 10:31
 */

public class Solution {

    public static int titleToNumber(String columnTitle) {

        int sum = 0;
        for (int i = columnTitle.length() - 1, j = 0; i >= 0; i--, j++) {
            sum += (columnTitle.charAt(i) - 64) * Math.pow(26, j);
        }

        return sum;
    }

    public static void main(String[] args) {
        String str = "BBB";
        System.out.println(titleToNumber(str));
    }
}
