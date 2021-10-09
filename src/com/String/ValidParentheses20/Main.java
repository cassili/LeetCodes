package com.String.ValidParentheses20;

import java.util.Stack;

/**
 * @Description:
 * @Author: hhh
 * @Version:
 * @Date: 2021/9/30 22:38
 */

public class Main {
    public static boolean main(String[] args) {

        String s = "()[]{}";
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}'){
                return false;
            }else {
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    stack.push(String.valueOf(s.charAt(i)));
                }else {
                    if(stack.size()==0){
                        return false;
                    }else{
                        char c = stack.pop().charAt(0);
                        if (!((c == '{' && s.charAt(i) == '}') || (c == '[' && s.charAt(i) == ']') || (c == '(' && s.charAt(i) == ')'))){
                            return false;
                        }
                    }
                }
            }
        }

        return stack.size() >= 1 ? false:true;

    }
}
