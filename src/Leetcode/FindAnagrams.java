package src.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAnagrams {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if( s.length()<p.length() || s==null || p==null)
            return ans;

        int pLen = p.length();
        int sLen = s.length();

        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();

        for(int i=0; i<pLen; i++){
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0)+1);
            windowMap.put(s.charAt(i), windowMap.getOrDefault(s.charAt(i), 0)+1);
        }
        if(pMap.equals(windowMap))
            ans.add(0);

        for(int i=pLen;  i<sLen; i++){
            char right = s.charAt(i);
            windowMap.put(s.charAt(i), windowMap.getOrDefault(right, 0)+1);

            int leftIndex = i - pLen;
            char left = s.charAt(leftIndex);
            if(windowMap.get(left) == 1)
                windowMap.remove(left);
            else
                windowMap.put(left, windowMap.get(left) - 1);

            if(pMap.equals(windowMap))
                ans.add(leftIndex + 1);
            //System.out.println("Left & Right: " + leftIndex + "," + i);
            //System.out.println(windowMap);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
        System.out.println(findAnagrams("abab", "ab"));
    }
}
