package Leetcode;

public class RotateString {
    private static boolean check(String s, String goal, int i) {
        int j = 0, len = goal.length();
        while (j < len) {
            if (i == len)
                i = 0;
            if (s.charAt(i) != goal.charAt(j))
                return false;
            j++;
            i++;
        }
        return true;
    }

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        int len = s.length();
        if (s.charAt(0) == goal.charAt(0) && !s.equals(goal))
            return false;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == goal.charAt(0) && check(s, goal, i))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcdef", "cdefab"));
    }
}
