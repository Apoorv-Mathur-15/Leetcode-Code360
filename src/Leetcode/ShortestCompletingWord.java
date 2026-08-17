package src.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();

        if(licensePlate.length() == 0) return "";

        HashMap<Character, Integer> licenseMap = new HashMap<>();
        for(char c : licensePlate.toCharArray()) {
            if(Character.isLetter(c))
                licenseMap.put(c, licenseMap.getOrDefault(c, 0) + 1);
        }
        String ans = null;
        int min = Integer.MAX_VALUE;
        for(String word : words){
            word = word.toLowerCase();
            //System.out.println("Word: " + word);
            HashMap<Character, Integer> wordMap = new HashMap<>();
            for(char c : word.toCharArray()) {
                if(Character.isLetter(c))
                    wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
            }
            boolean check = true;
            //System.out.println("Before for Loop, Check: " + check);
            for(Map.Entry<Character, Integer> entry : licenseMap.entrySet()) {
                char key = entry.getKey();
                int count =  entry.getValue();
                //System.out.println("Key, Count of License: "+ key + " " + count);
                //System.out.println("Key, Count of word: "+ key + " " + wordMap.get(key));
                if(wordMap.getOrDefault(key, 0) < count){
                    check = false;
                    break;
                }
            }
            //System.out.println("After for Loop, Check: " + check);
            if(check) {
                if(ans==null){
                    ans = word;
                    min = ans.length();
                }
                else {
                    if(word.length()<min){
                        min = word.length();
                        ans = word;
                    }
                }
            }
            //System.out.println("Ans: " + ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(shortestCompletingWord("1s3 PSt", new String[]{"step","steps","stripe","stepple"}));
    }
}
