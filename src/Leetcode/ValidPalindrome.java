package src.Leetcode;

public class ValidPalindrome {
    public static boolean isPalindrome(String s){
        if(s == null)
            return true;
        String cleanedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversedString = new StringBuilder(cleanedString).reverse().toString();
        return reversedString.equals(cleanedString);
    }
}
