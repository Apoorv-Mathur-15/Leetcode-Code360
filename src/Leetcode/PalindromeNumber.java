package Leetcode;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        if (s.equals(s1)) return true;
        else return false;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Number " + n + "'s Palindrome Check is: " + isPalindrome(n));
    }
}
