package src.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class NumberOfDistinctColourBalls {
    public static int[] queryResults(int limit, int[][] queries) {
        int[] result = new int[queries.length];
        Map<Integer, Integer> ballToColor = new HashMap<>();
        Map<Integer, Integer> colorToCount = new HashMap<>();
        for (int i = 0; i < queries.length; i++) {
            final int ball = queries[i][0];
            final int color = queries[i][1];
            if (ballToColor.containsKey(ball)) {
                int oldColor = ballToColor.get(ball);
                int oldColorCount = colorToCount.get(oldColor);
                if (oldColorCount >= 2)
                    colorToCount.put(oldColor, oldColorCount - 1);
                else
                    colorToCount.remove(oldColor);
            }
            ballToColor.put(ball, color);
            colorToCount.put(color, colorToCount.getOrDefault(color, 0) + 1);
            result[i] = colorToCount.size();
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] queries = {{1, 4}, {2, 5}, {1, 3}, {3, 4}};
        int[] result = queryResults(4, queries);
        for (int i : result)
            System.out.print(i + " ");
    }
}
