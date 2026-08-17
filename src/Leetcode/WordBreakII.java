package src.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreakII {
    private static Map<Integer, List<String>> memo;

    public static List<String> wordBreak(String s, List<String> wordDict) {
        memo = new HashMap<>();
        return dp(s, 0, wordDict);
    }

    private static List<String> dp(String s, int start, List<String> wordDict) {
        if( start == s.length()){
            return new ArrayList<>(List.of(""));
        }
        if( memo.containsKey(start)){
            return memo.get(start);
        }
        List<String> result = new ArrayList<>();

        for(String word : wordDict){
            int len = word.length();

            if(start + len > s.length())
                continue;
            if(!s.substring(start, start + len).equals(word))
                continue;

            List<String> suffixSentences = dp(s, start + len, wordDict);

            for(String suffix :  suffixSentences){
                if(suffix.isEmpty())
                    result.add(word);
                else
                    result.add(word + " " + suffix);
            }
        }
        memo.put(start, result);
        return result;
    }

    static void main() {
        System.out.println(wordBreak("leetcode", List.of("leet", "code")));
        System.out.println(wordBreak("catsanddog", List.of("cat", "cats", "and", "sand", "dog")));
        System.out.println(wordBreak("catsandog", List.of("cat", "cats", "and", "sand", "dog")));
    }
}
