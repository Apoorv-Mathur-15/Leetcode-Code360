package src.Leetcode;

import java.util.HashMap;

public class FindTheDifference {
    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char c : s.toCharArray())
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        for(char c : t.toCharArray())
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        for(char c : map2.keySet()){
            if(!map1.containsKey(c))
                return c;
            if(map1.containsKey(c)){
                if(map1.get(c) != map2.get(c))
                    return c;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcs", "abcsf"));
    }
}
