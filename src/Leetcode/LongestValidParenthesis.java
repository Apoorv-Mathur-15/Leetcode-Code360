package src.Leetcode;

import java.util.Stack;

public class LongestValidParenthesis {
    public static int longestValidParentheses(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else {
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        System.gc();
        return max;
    }

    static void main(String[] args) {
        System.out.println(longestValidParentheses("(()()"));
    }
}
