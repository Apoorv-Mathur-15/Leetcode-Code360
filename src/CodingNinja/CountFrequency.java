package src.CodingNinja;

import java.util.HashMap;

public class CountFrequency {
    public static int[] findFrequency(String S){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<S.length(); i++)
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        int[] freq = new int[26];
        for(int i=0; i<26; i++){
            char ch = (char) ('a' + i + 1);
            freq[i] = map.getOrDefault(ch, 0);
        }
        return freq;
    }
}
