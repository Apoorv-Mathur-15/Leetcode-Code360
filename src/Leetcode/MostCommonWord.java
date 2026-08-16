package src.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> banMap = new HashMap<String, Integer>();
        HashMap<String, Integer> para = new HashMap<String, Integer>();

        for(String word : banned){
            word = word.toLowerCase();
            banMap.put(word, banMap.getOrDefault(word, 0)+1);
        }

        for(String word : paragraph.split("\\W+")){
            word = word.toLowerCase();
            if(banMap.containsKey(word))
                continue;
            para.put(word, para.getOrDefault(word, 0)+1);
        }

        return para.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public static void main(String[] args) {
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
    }
}
