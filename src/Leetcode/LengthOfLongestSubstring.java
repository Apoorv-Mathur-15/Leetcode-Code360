package src.Leetcode;

import java.util.HashMap;

public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int start = 0, maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch) && map.get(ch) >= start)
                start = map.get(ch) + 1;
            maxLength = Math.max(maxLength, i - start + 1);
            map.put(ch, i);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("Length of Longest Substring from abcabcbb: " + lengthOfLongestSubstring("abcabcbb"));
        System.out.println("Length of Longest Substring from bbbbb: " + lengthOfLongestSubstring("bbbbb"));
        System.out.println("Length of Longest Substring from pwwkew: " + lengthOfLongestSubstring("pwwkew"));
    }
}
