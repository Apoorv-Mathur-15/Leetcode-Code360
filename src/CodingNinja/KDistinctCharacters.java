package src.CodingNinja;

import java.util.HashMap;
import java.util.Map;

public class KDistinctCharacters {

    public static int kDistinctChars(int k, String str){
        int max = 0, start = 0;
        Map<Character, Integer> charCount = new HashMap<>();
        for(int end=0; end<str.length(); end++){
            char endChar = str.charAt(end);
            charCount.put(endChar, charCount.getOrDefault(endChar, 0) + 1);
            while (charCount.size() > k){
                char startChar = str.charAt(start);
                charCount.put(startChar, charCount.get(startChar) - 1);
                if(charCount.get(startChar) == 0)
                    charCount.remove(startChar);
                start++;
            }
            max = Math.max(max, end - start + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(kDistinctChars(2, "aaaabbbbbbcd"));
    }
}
