package src.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSliding {
    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for(char c : t.toCharArray()){
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        int left = 0, right = 0, minLen = Integer.MAX_VALUE, minStart = 0;
        while(right < s.length()){
            char rightChar = s.charAt(right);
            sMap.put(rightChar, sMap.getOrDefault(rightChar, 0) + 1);
            right++;

            while(containsAllChars(sMap, tMap)){
                if(right - left < minLen){
                    minLen = right - left;
                    minStart = left;
                }
                char leftChar = s.charAt(left);
                sMap.put(leftChar,  sMap.get(leftChar) - 1);
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }

    private static boolean containsAllChars(HashMap<Character, Integer> sMap, HashMap<Character, Integer> tMap){
        for(Map.Entry<Character, Integer> entry : tMap.entrySet()){
            char c = entry.getKey();
            int count = entry.getValue();
            if(sMap.getOrDefault(c, 0) < count)
                return false;
        }
        return true;
    }

    public static void main() {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(minWindow("a", "a"));
        System.out.println(minWindow("a", "aa"));
    }
}
