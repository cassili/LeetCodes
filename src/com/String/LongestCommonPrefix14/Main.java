package com.String.LongestCommonPrefix14;

import java.util.Arrays;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/9/30 21:04
 */

public class Main {

    public static void main(String[] args) {

        String strArray[] = {"ab", "a"};
        Arrays.sort(strArray);

        int i = 0;

        String first = strArray[0];
        String last = strArray[strArray.length - 1];
        int len = first.length();

        if (strArray.length == 0 || "".equals(strArray[0])) {
            System.out.println("");
        }

        while (i < len) {
            System.out.println(i);
            if (first.charAt(i) == last.charAt(i)) {
                i++;
            } else {
                System.out.println(first.substring(0, i));
                break;
            }
        }


        /*
        // 遍历数组，求出元素的最短长度n
        // 把n当做最长度，遍历元素
        // 定义字符串，str做最短前缀
        // 取出值，依次和后面的做比较，完全相同，拼接在字符串上面

        String strArray[] = {"flower", "flow", "flight"};
        int n = 0;
        StringBuffer str = new StringBuffer();

        for (int i = 0; i < strArray.length; i++) {
            if (n < strArray[i].length()) {
                n = strArray[i].length();
            }
        }

        for (int i = 0; i < n; i++) {

        }
        */

    }
}
