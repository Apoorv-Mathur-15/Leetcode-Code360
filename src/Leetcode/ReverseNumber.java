package Leetcode;

public class ReverseNumber {

    public static int reverse(int x) {
        long ans = 0;
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : (int) ans;

    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}