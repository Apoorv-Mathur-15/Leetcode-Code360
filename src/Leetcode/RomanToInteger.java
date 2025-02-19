package src.Leetcode;

public class RomanToInteger {
    public static int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return -1;
    }

    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int s2 = value(s.charAt(i + 1));
                if (s1 > s2)
                    result += s1;
                else {
                    result += s2;
                    i++;
                }
            } else
                result += s1;
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "C", s2 = "M", s3 = "DCCCXVI", s4 = "CMLII", s5 = "CDLVI", s6 = "DLV";
        System.out.println(romanToInt(s1));
        System.out.println(romanToInt(s2));
        System.out.println(romanToInt(s3));
        System.out.println(romanToInt(s4));
        System.out.println(romanToInt(s5));
        System.out.println(romanToInt(s6));
    }
}
