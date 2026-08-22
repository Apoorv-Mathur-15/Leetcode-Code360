package src.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class CommonChars {

    public static List<String> commonChars(String[] words) {
        int[] common = new int[26];

        // Frequency of characters in the first word
        for (char c : words[0].toCharArray()) {
            common[c - 'a']++;
        }

        // Find minimum frequency across all words
        for (int i = 1; i < words.length; i++) {
            int[] current = new int[26];

            for (char c : words[i].toCharArray()) {
                current[c - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                common[j] = Math.min(common[j], current[j]);
            }
        }

        // Build result
        List<String> res = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            while (common[i] > 0) {
                res.add(String.valueOf((char) ('a' + i)));
                common[i]--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(
                commonChars(new String[]{"bella", "label", "roller"})
        );

        System.out.println(
                commonChars(new String[]{"cool", "lock", "cook"})
        );
    }
}
