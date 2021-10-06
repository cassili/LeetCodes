package com.IsomorphicStrings205;

import java.util.HashMap;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/6 10:55
 */

public class Solution {

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> characterHashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (characterHashMap.containsKey(s.charAt(i)) && characterHashMap.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }

            if (characterHashMap.containsValue(t.charAt(i))) {
                for (Character getKey : characterHashMap.keySet()) {
                    if (characterHashMap.get(getKey).equals(t.charAt(i))) {
                        if (t.charAt(i) != s.charAt(i)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            characterHashMap.put(s.charAt(i), t.charAt(i));
        }

        return true;

    }

    public static void main(String[] args) {
        String s = "egg", t = "add";
//        String s = "badc", t = "baba";

        System.out.println(isIsomorphic(s, t));
    }
}
