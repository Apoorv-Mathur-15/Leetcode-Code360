package src.CodingNinja;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubStrings {
    public static int uniqueSubstrings(String input) {
        int n = input.length(), left = 0, maxLength = 0;
        Set<Character> charSeen = new HashSet<>();
        for(int right = 0; right< n; right++){
            while (charSeen.contains(input.charAt(right))){
                charSeen.remove(input.charAt(left));
                left++;
            }
            charSeen.add(input.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(uniqueSubstrings("abcabcbb"));
        System.out.println(uniqueSubstrings("aaaa"));
    }
}
