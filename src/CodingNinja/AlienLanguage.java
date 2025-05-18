package src.CodingNinja;

import java.util.*;

public class AlienLanguage {
    public static String getAlienLanguage(String[] dictionary, int k) {
        // Step 1: Build adjacency list and in-degree array
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            adj.add(new ArrayList<>());
        }

        int[] inDegree = new int[k];

        for (int i = 0; i < dictionary.length - 1; i++) {
            String word1 = dictionary[i];
            String word2 = dictionary[i + 1];
            int len = Math.min(word1.length(), word2.length());
            for (int j = 0; j < len; j++) {
                char c1 = word1.charAt(j);
                char c2 = word2.charAt(j);
                if (c1 != c2) {
                    int u = c1 - 'a';
                    int v = c2 - 'a';
                    adj.get(u).add(v);
                    inDegree[v]++;
                    break;
                }
            }
        }

        // Step 2: Topological sort (Kahn's algorithm)
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            result.append((char) (curr + 'a'));

            for (int neighbor : adj.get(curr)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

    }
}
