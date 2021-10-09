package com.String.ExcelSheetColumnTitle168;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/6 00:24
 */

public class Solution {

    public static String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder();

        // ASCII码 : A-Z 65-90
        while (columnNumber > 0) {
            sb.insert(0,(char)((--columnNumber%26)+65));
            columnNumber = columnNumber / 26;
        }

        return sb.toString();

    }

    /**
     * 最优解
     * @param columnNumber
     * @return
     */
    public static String convertToTitle2(int columnNumber) {
        StringBuilder s = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            s.insert(0, (char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return s.toString();
    }

    public static void main(String[] args) {
        int num1 = 1406;
        System.out.println(convertToTitle(num1));
    }
}
