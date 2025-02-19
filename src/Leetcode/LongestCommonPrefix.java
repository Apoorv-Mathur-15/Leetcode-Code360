package Leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] s) {
        Arrays.sort(s);
        String s1 = s[0];
        String s2 = s[s.length - 1];
        int index = 0;
        while (index < s1.length() && index < s2.length()) {
            if (s1.charAt(index) == s2.charAt(index))
                index++;
            else
                break;
        }
        return s1.substring(0, index);
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        String[] strs1 = new String[]{"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix is: " + longestCommonPrefix(strs));
        System.out.println("Longest Common Prefix is: " + longestCommonPrefix(strs1));
    }
}
