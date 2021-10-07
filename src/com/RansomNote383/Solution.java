package com.RansomNote383;

import java.util.HashMap;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/8 07:17
 */

public class Solution {

    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        // 得到一个map，key是ransomNote中的每一个字符，value是字符出现的次数
        for (Character c : ransomNote.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        // 遍历magazine中的每一个字符，如果在map中出现，则value值减去1，直到值为0，删掉key
        for (Character c : magazine.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    map.remove(c);
                }
            }

        }

        if (map.size() == 0) {
            return true;
        } else {
            return false;
        }


    }

    public static void main(String[] args) {
        String ransomNote = "a", magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
