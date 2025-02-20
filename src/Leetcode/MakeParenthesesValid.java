package src.Leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MakeParenthesesValid {
    public static int minAddToMakeValid(String s){
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c == ')'){
                if(!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
                else
                    stack.push(c);
            }
            else {
                stack.push(c);
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        String s1 = "())";
        String s2 = "(((";
        System.out.println(minAddToMakeValid(s1));
        System.out.println(minAddToMakeValid(s2));
    }
}
