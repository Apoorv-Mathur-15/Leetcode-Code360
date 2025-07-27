package src.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSubString {
    public static List<Integer> findSubString(String s, String[] words){
        List<Integer> ans = new ArrayList<>();
        int length1 = words[0].length();
        int length2 = s.length();
        Map<String,Integer> map = new HashMap<>();
        for(String string : words)
            map.put(string, map.getOrDefault(string, 0) + 1);
        for(int i=0; i<length1; i++){
            int left = i, j = i, c = 0;
            Map<String, Integer> subMap = new HashMap<>();
            while (j + length1 <= length2) {
                String word1 = s.substring(j, j + length1);
                j += length1;
                if(map.containsKey(word1)){
                    subMap.put(word1, subMap.getOrDefault(word1, 0) + 1);
                    c++;
                    while (subMap.get(word1) > map.get(word1)) {
                        String word2 = s.substring(left, left + length1);
                        subMap.put(word2, subMap.get(word2) - 1);
                        left += length1;
                        c--;
                    }
                    if(c == words.length)
                        ans.add(left);
                }
                else {
                    subMap.clear();
                    c = 0;
                    left = j;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        System.out.println(findSubString(s, words));
    }
}
