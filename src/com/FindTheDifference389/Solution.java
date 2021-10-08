package com.FindTheDifference389;

import java.util.HashMap;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/8 11:10
 */

public class Solution {

    /**
     * Runtime: 6 ms, faster than 27.30% of Java online submissions for Find the Difference.
     * Memory Usage: 37.4 MB, less than 70.56% of Java online submissions for Find the Difference.
     *
     * @param s
     * @param t
     * @return
     */
    public static char findTheDifference(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        // 将s中的每一个字符都放进map中
        for (Character c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        //
        StringBuilder sb = new StringBuilder();
        for (Character c : t.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            } else {
                sb.append(c);
            }
        }

        if (map.containsValue(-1)) {
            for (Character k : map.keySet()) {
                if (map.get(k) == -1) {
                    return k;
                }
            }
        }

        return sb.charAt(0);


    }

    /**
     * Runtime: 1 ms, faster than 99.05% of Java online submissions for Find the Difference.
     * Memory Usage: 37.2 MB, less than 88.63% of Java online submissions for Find the Difference.
     *
     * @param s
     * @param t
     * @return
     */
    public static char findTheDifference2(String s, String t) {

        int k = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            k += s.charAt(i);
            j += t.charAt(i);
        }
        j += t.charAt(s.length());
        return (char) (j - k);
    }


    public static void main(String[] args) {
        String s = "a", t = "aa";
        System.out.println(findTheDifference2(s, t));
    }
}
