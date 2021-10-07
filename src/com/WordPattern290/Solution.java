package com.WordPattern290;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/7 12:44
 */

public class Solution {

    public static boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        String[] s1 = s.split(" ");
        if (pattern.length() != s1.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {  // 遍历 pattern
            char key = pattern.charAt(i);
            String value = s1[i];
            if (!map.containsKey(key)) {  // map 不包含 key，添加
                if (set.contains(value)) {
                    return false;
                }
                map.put(key, value);
                set.add(value);
            } else {  // map 包含 key，添加
                if (!map.get(key).equals(s1[i])) {
                    return false;
                }
            }

        }

        return true;

    }

    public static void main(String[] args) {
        String pattern = "abba", s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }
}
