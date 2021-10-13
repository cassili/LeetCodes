package com.String.LicenseKeyFormatting482;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/13 22:18
 */

public class Solution {

    /**
     * Runtime: 15 ms, faster than 62.07% of Java online submissions for License Key Formatting.
     * Memory Usage: 42 MB, less than 34.78% of Java online submissions for License Key Formatting.
     *
     * @param s
     * @param k
     * @return
     */
    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int j = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = Character.toUpperCase(s.charAt(i));
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {  // 如果字符不是数字或者字母的话，跳过
                continue;
            }
            if (j < k) {
                sb.append(c);
                j++;
            }
            if (j == k) {
                sb.append('-');
                j = 0;
            }
        }

        if (sb.length() == 0) {
            return "";
        }
        if (sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "---";
        int k = 3;
        System.out.println(licenseKeyFormatting(s, k));
    }
}
