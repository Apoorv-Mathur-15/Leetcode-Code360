package src.Leetcode;

import java.util.Arrays;

public class ReverseString {
    public static void reverseString(char[] s) {
        int n = s.length;
        for (int i = 0; i < n/2; i++) {
            char temp = s[i];
            s[i] = s[n - i -1];
            s[n - i - 1] = temp;
            System.out.println(Arrays.toString(s));
        }
        System.out.println(Arrays.toString(s));
    }

    static void main() {
        reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }
}
