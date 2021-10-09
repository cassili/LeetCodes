package com.String.NumberOfSegmentsInAString434;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/9 21:48
 */

public class Solution {

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Segments in a String.
     * Memory Usage: 38.2 MB, less than 34.59% of Java online submissions for Number of Segments in a String.
     *
     * @param s
     * @return
     */
    public static int countSegments(String s) {
        String[] s1 = s.split(" ");
        int cnt = 0;

        for (int i = 0; i < s1.length; i++) {
            if (s1[i].length() != 0) {
                cnt += 1;
            }
        }
        return cnt;
    }

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Segments in a String.
     * Memory Usage: 38.6 MB, less than 21.97% of Java online submissions for Number of Segments in a String.
     *
     * @param s
     * @return
     */
    public int countSegments2(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int count = 0;
        String[] str = s.split(" ", 0);
        for (String a : str) {
            if (a.length() != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = ", , , ,        a, eaefa";
        System.out.println(countSegments(s));
    }
}
