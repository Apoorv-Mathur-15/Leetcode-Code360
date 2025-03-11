package src.CodingNinja;

import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']')
            return false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            else if (st.isEmpty() && (ch == ')' || ch == '}' || ch == ']'))
                return false;
            else if ((st.peek() == '(' && ch == ')') || (st.peek() == '[' && ch == ']') || (st.peek() == '{' && ch == '}'))
                st.pop();
            else
                return false;
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("()[]{}"));
        System.out.println(isBalanced("()[]{}["));
    }
}
