package src.CodingNinja;

import java.util.ArrayList;
import java.util.Collections;

public class RatInAMace {

    public static ArrayList<String> findSum(int[][] arr, int n) {
        ArrayList<String> result = new ArrayList<>();

        if(arr[0][0] == 0 || arr[n - 1][n - 1] == 0)
            return result;

        boolean[][] visited = new boolean[n][n];
        findPaths(arr, n, 0, 0, "", visited, result);

        Collections.sort(result); // Alphabetical order
        return result;
    }

    private static void findPaths(int[][] arr, int n, int x, int y, String path, boolean[][] visited, ArrayList<String> result) {
        // Base case: reached destination
        if (x == n - 1 && y == n - 1) {
            result.add(path);
            return;
        }

        // Direction vectors
        int[] dx = {1, 0, 0, -1}; // D, L, R, U
        int[] dy = {0, -1, 1, 0}; // D, L, R, U
        char[] dir = {'D', 'L', 'R', 'U'};

        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (isSafe(newX, newY, arr, visited, n)) {
                findPaths(arr, n, newX, newY, path + dir[i], visited, result);
            }
        }

        visited[x][y] = false; // Backtrack
    }

    private static boolean isSafe(int x, int y, int[][] arr, boolean[][] visited, int n) {
        return (x >= 0 && y >= 0 && x < n && y < n && arr[x][y] == 1 && !visited[x][y]);
    }
}
