package Leetcode;

public class CheckPalindrome {
    public static boolean checkPalindrome(int x) {
        if (x < 0)
            return false;
        long ans = 0;
        int orig = x;
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return (ans == orig);
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(-123));
    }
}
