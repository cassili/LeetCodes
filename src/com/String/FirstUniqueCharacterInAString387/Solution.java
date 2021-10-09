package com.String.FirstUniqueCharacterInAString387;

import java.util.HashMap;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/8 07:38
 */

public class Solution {

    /**
     * 自己做的
     * Runtime: 24 ms, faster than 42.06% of Java online submissions for First Unique Character in a String.
     * Memory Usage: 39.4 MB, less than 79.53% of Java online submissions for First Unique Character in a String.
     *
     * @param s
     * @return
     */
    public static int firstUniqChar(String s) {

        if (s.length() == 1) {
            return 0;
        }

        // 将s中的每一个字符放进map中，value就是字符出现的次数
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        // 拿出每一个字符，遍历，找到map中的value，当值为1的时候，break
        int i = 0;
        boolean flag = true;
        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                flag = false;
                break;
            }
        }

        return flag == false ? i : -1;

    }

    /**
     * Runtime: 20 ms, faster than 61.31% of Java online submissions for First Unique Character in a String.
     * Memory Usage: 39.3 MB, less than 87.79% of Java online submissions for First Unique Character in a String.
     *
     * @param s
     * @return
     */
    public static int firstUniqChar2(String s) {

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (s.indexOf(charArray[i]) == s.lastIndexOf(charArray[i])) {
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }
}
