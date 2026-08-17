package src.Leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordLadder {

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord))
            return 0;

        if (beginWord.equals(endWord))
            return 1;

        Set<String> wordSet = new HashSet<>(wordList);

        Set<String> beginSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();

        beginSet.add(beginWord);
        endSet.add(endWord);

        int len = 1;
        int strLen = beginWord.length();

        while (!beginSet.isEmpty() && !endSet.isEmpty()) {

            // Always expand the smaller frontier
            if (beginSet.size() > endSet.size()) {
                Set<String> temp = beginSet;
                beginSet = endSet;
                endSet = temp;
            }

            Set<String> nextLevel = new HashSet<>();

            for (String word : beginSet) {
                char[] chars = word.toCharArray();

                for (int i = 0; i < strLen; i++) {
                    char original = chars[i];

                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == original) {
                            continue;
                        }

                        chars[i] = c;
                        String nextWord = new String(chars);

                        // The two BFS searches have met
                        if (endSet.contains(nextWord)) {
                            return len + 1;
                        }

                        // Valid dictionary word not visited yet
                        if (wordSet.contains(nextWord)) {
                            nextLevel.add(nextWord);
                            wordSet.remove(nextWord);
                        }
                    }

                    chars[i] = original;
                }
            }

            beginSet = nextLevel;
            len++;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog")));
        System.out.println(ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log")));
    }
}
