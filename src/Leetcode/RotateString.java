package src.Leetcode;

public class RotateString {

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        return (s + s).contains(goal);
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcdef", "cdefab"));
        System.out.println(rotateString("abcde", "abced"));
        System.out.println(rotateString("defdefdefabcabc", "defdefabcabcdef"));
        System.out.println(rotateString("aaba", "aaab"));
    }
}
