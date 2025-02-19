package src.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveOutermostParentheses {
    public static String removeOutermostParentheses(String s) {
        List<String> primitives = new ArrayList<>();
        int i = 1;
        while (i < s.length()) {
            int initial = i - 1;
            int left = 1;
            while (i < s.length() && left > 0) {
                if (s.charAt(i) == '(')
                    left++;
                else
                    left--;
                i++;
            }
            primitives.add(s.substring(initial, i));
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (String primitive : primitives)
            sb.append(primitive, 1, primitive.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        String s1 = "(()())(())(()(()))";
        String s2 = "()())";
        System.out.println(removeOutermostParentheses(s));
        System.out.println(removeOutermostParentheses(s1));
        System.out.println(removeOutermostParentheses(s2));
    }
}
