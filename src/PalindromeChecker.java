package src;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();

        String cleanInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reverseInput = new StringBuilder(cleanInput).reverse().toString();

        if (cleanInput.equals(reverseInput))
            System.out.println("Palindrome String.");
        else
            System.out.println("Not a Palindrome String.");
    }
}
