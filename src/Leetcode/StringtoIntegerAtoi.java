package Leetcode;

public class StringtoIntegerAtoi {
    public static int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty())
            return 0;
        int sign = 1, start = 0;
        long result = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            start++;
        }
        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c))
                break;
            result = result * 10 + (c - '0');
            if (result * sign > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (result * sign < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
        return (int) (result * sign);
    }

    public static void main(String[] args) {
        String s1 = "42", s2 = " -42", s3 = "4193 with words", s4 = "words and 987", s5 = "-91283472332";
        System.out.println(myAtoi(s1));
        System.out.println(myAtoi(s2));
        System.out.println(myAtoi(s3));
        System.out.println(myAtoi(s4));
        System.out.println(myAtoi(s5));
    }
}
