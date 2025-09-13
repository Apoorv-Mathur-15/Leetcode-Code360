package src.Leetcode;

import java.util.HashMap;

public class LongestPalindrome {
    public static int longestPalindrome(String s){
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray())
            freq.put(c, freq.getOrDefault(c,0) + 1);
        int length = 0;
        boolean hasOdd = false;
        for(int count : freq.values()){
            length += (count / 2) * 2;
            if(count % 2 == 1)
                hasOdd = true;
        }
        if(hasOdd)
            length += 1;
        return length;
    }

    static void main(String[] args) {
        System.out.println(longestPalindrome("shggfvhvfs"));
    }
}
