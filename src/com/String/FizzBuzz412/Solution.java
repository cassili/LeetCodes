package com.String.FizzBuzz412;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/10/9 20:24
 */

public class Solution {


    /**
     * Runtime: 1 ms, faster than 99.67% of Java online submissions for Fizz Buzz.
     * Memory Usage: 40.3 MB, less than 58.33% of Java online submissions for Fizz Buzz.
     *
     * @param n
     * @return
     */
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        /**
         * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
         * answer[i] == "Fizz" if i is divisible by 3.
         * answer[i] == "Buzz" if i is divisible by 5.
         * answer[i] == i if non of the above conditions are true.
         */

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else {
                list.add(String.valueOf(i));
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(fizzBuzz(n));
    }
}
