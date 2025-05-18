package src.CodingNinja;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FireInTheCells {
    public static int fireInTheCells(int[][] mat, int N, int M, int X, int Y) {
        if(mat[X][Y] == 0)
            return -1;
        int fireTime[][] = new int[N][M];
        for(int[] row : fireTime)
            Arrays.fill(row, Integer.MAX_VALUE);

        Queue<int[]> fireQueue = new LinkedList<>();

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(mat[i][j] == 0){
                    fireQueue.add(new int[]{i, j});
                    fireTime[i][j] = 0;
                }
            }
        }

        while (!fireQueue.isEmpty()){
            int[] cell = fireQueue.poll();
            int x = cell[0], y = cell[1];

            for(int d=0; d<4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];

                if(nx >= 0 && ny >= 0 && nx < N && ny < M && fireTime[nx][ny] > fireTime[x][y] + 1){
                    fireTime[nx][ny] = fireTime[x][y] + 1;
                    fireQueue.add(new int[]{nx, ny});
                }
            }
        }

        boolean[][] visited = new boolean[N][M];
        Queue<int[]> personQueue = new LinkedList<>();
        personQueue.add(new int[]{X,Y,0});
        visited[X][Y] = true;

        while (!personQueue.isEmpty()){
            int[] cur = personQueue.poll();
            int x = cur[0], y = cur[1], time = cur[2];

            if((x == 0 || x == N - 1 || y == 0 || y == M - 1) && !(x == 0 && y == 0) && !(x == 0 && y == M - 1) && !(x == N - 1 && y == 0) && !(x == N - 1 && y == M - 1)){
                if(time < fireTime[x][y])
                    return time;
            }

            for(int d=0; d<4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];
                int nextTime = time + 1;

                if (nx >= 0 && ny >= 0 && nx < N && ny < M && !visited[nx][ny] && mat[nx][ny] == 1 && nextTime < fireTime[nx][ny]) {
                    visited[nx][ny] = true;
                    personQueue.add(new int[]{nx, ny, nextTime});
                }
            }
        }
        return -1;
    }
}
