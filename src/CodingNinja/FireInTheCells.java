package src.CodingNinja;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FireInTheCells {
    public static int fireInTheCells(int[][] mat, int N, int M, int X, int Y) {
        int[][] fireTime = new int[N][M];
        for (int[] row : fireTime) Arrays.fill(row, Integer.MAX_VALUE);

        Queue<int[]> fireQueue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (mat[i][j] == 0) {
                    fireQueue.offer(new int[]{i, j});
                    fireTime[i][j] = 0;
                }
            }
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        // BFS to calculate fire spread times
        while (!fireQueue.isEmpty()) {
            int[] cell = fireQueue.poll();
            int r = cell[0], c = cell[1];
            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d], nc = c + dc[d];
                if (nr >= 0 && nr < N && nc >= 0 && nc < M) {
                    if (mat[nr][nc] == 1 && fireTime[nr][nc] > fireTime[r][c] + 1) {
                        fireTime[nr][nc] = fireTime[r][c] + 1;
                        fireQueue.offer(new int[]{nr, nc});
                    }
                }
            }
        }

        // Person's BFS
        if (mat[X][Y] == 0) return -1;

        boolean[][] visited = new boolean[N][M];
        Queue<int[]> personQueue = new LinkedList<>();
        personQueue.offer(new int[]{X, Y, 0});
        visited[X][Y] = true;

        while (!personQueue.isEmpty()) {
            int[] cell = personQueue.poll();
            int r = cell[0], c = cell[1], t = cell[2];

            boolean isEdge = (r == 0 || r == N - 1 || c == 0 || c == M - 1);
            boolean isCorner = (r == 0 && c == 0) || (r == 0 && c == M - 1) ||
                    (r == N - 1 && c == 0) || (r == N - 1 && c == M - 1);

            if (isEdge && !isCorner && t < fireTime[r][c]) {
                return t;
            }

            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d], nc = c + dc[d];
                if (nr >= 0 && nr < N && nc >= 0 && nc < M) {
                    if (!visited[nr][nc] && mat[nr][nc] == 1 && t + 1 < fireTime[nr][nc]) {
                        visited[nr][nc] = true;
                        personQueue.offer(new int[]{nr, nc, t + 1});
                    }
                }
            }
        }

        return -1;
    }
}
