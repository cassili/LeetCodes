package com.Array.TwoSum1;


import java.util.HashMap;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/15 14:23
 */

public class Solution {
    /**
     * Runtime: 93 ms, faster than 12.08% of Java online submissions for Two Sum.
     * Memory Usage: 42.2 MB, less than 22.79% of Java online submissions for Two Sum.
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] ints = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1 + i; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    ints[0] = i;
                    ints[1] = j;
                    return ints;
                }
            }
        }
        return null;
    }


    /**
     * Runtime: 2 ms, faster than 76.69% of Java online submissions for Two Sum.
     * Memory Usage: 42.8 MB, less than 13.51% of Java online submissions for Two Sum.
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;
        int target = 9;

        System.out.println(twoSum(nums, target));
    }
}
