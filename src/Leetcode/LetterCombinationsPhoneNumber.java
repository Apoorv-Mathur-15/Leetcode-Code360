package src.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsPhoneNumber {
    private static final Map<Character, String> digitsToLetters = new HashMap<>();

    static {
        digitsToLetters.put('2', "abc");
        digitsToLetters.put('3', "def");
        digitsToLetters.put('4', "ghi");
        digitsToLetters.put('5', "jkl");
        digitsToLetters.put('6', "mno");
        digitsToLetters.put('7', "prqs");
        digitsToLetters.put('8', "tuv");
        digitsToLetters.put('9', "wxyz");
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0)
            return result;
        generateCombinations(result, digits, "", 0);
        return result;
    }

    private static void generateCombinations(List<String> result, String digits, String combination, int index) {
        if (index == digits.length()) {
            result.add(combination);
            return;
        }
        char digit = digits.charAt(index);
        String letters = digitsToLetters.get(digit);
        for (char letter : letters.toCharArray())
            generateCombinations(result, digits, combination + letter, index + 1);
    }

    public static void main(String[] args) {
        String s1 = "23", s2 = "", s3 = "456";
        System.out.println(letterCombinations(s1));
        System.out.println(letterCombinations(s2));
        System.out.println(letterCombinations(s3));
    }
}
