package com.Array.RemoveDuplicatesFromSortedArray26;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/15 14:46
 */

public class Solution {
    public int removeDuplicates(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1 + i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    continue;
                }
            }

        }
        return 0;

    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4};
        System.out.println(nums);
    }
}
