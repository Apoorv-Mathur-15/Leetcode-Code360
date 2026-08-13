package src.Leetcode.MathQuest;

public class IsPalindrome {
    public static boolean isPalindrome(int n) {
        if(n < 0)
            return false;
        int original = n, rev = 0;
        while (n > 0) {
            int temp = n % 10;
            rev = rev * 10 + temp;
            n /= 10;
        }
        if(rev == original)
            return true;
        return false;
    }

    public static void main() {
        System.out.println("10 is a Palindrome Number?: "+isPalindrome(10));
        System.out.println("121 is a Palindrome Number?: "+isPalindrome(121));
    }
}
