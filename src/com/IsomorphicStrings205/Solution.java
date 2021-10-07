package com.IsomorphicStrings205;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/6 10:55
 */

public class Solution {

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);
            if (map.containsKey(key) == false) {  // key 不在 map 中
                if (set.contains(value)) {
                    return false;
                }
                map.put(key, value);
                set.add(value);
            } else {  // key 在 map 中
                if (!map.get(key).equals(value)) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "egg", t = "add";
//        String s = "badc", t = "baba";

        System.out.println(isIsomorphic(s, t));
    }
}
