package src.CodingNinja;

import java.util.ArrayList;

public class RatInAMazeAllPaths {
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        ArrayList<ArrayList<Integer>> allPaths = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];

        if (n == 1 && maze[0][0] == 1) {
            ArrayList<Integer> singleCellPath = new ArrayList<>();
            singleCellPath.add(1); // index (0,0) = 0*1 + 0 = 0
            allPaths.add(singleCellPath);
            return allPaths;
        }
        if(maze[0][0] == 0 || maze[n-1][n-1] == 0)
            return allPaths;

        ArrayList<Integer> path = new ArrayList<>();
        findPaths(0, 0, maze, visited, path, allPaths, n);
        return allPaths;
    }

    private static void findPaths(int x, int y, int[][] maze, boolean[][] visited, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> allPaths, int n) {
        //Base Case:- Destination reached
        if(x == n-1 && y == n-1){
            path.add(x * n + y);
            allPaths.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }

        visited[x][y] = true;
        path.add(x);
        path.add(y);

        int[] dx = {1, 0, 0, -1};
        int[] dy = {0, -1, 1, 0};

        for (int dir = 0; dir < 4; dir++) {
            int newX = x + dx[dir];
            int newY = y + dy[dir];

            if (isSafe(newX, newY, maze, visited, n)) {
                findPaths(newX, newY, maze, visited, path, allPaths, n);
            }
        }

        path.remove(path.size() - 1);
        visited[x][y] = false;
    }

    private static boolean isSafe(int x, int y, int[][] maze, boolean[][] visited, int n) {
        return x >= 0 && y >= 0 && x < n && y < n && maze[x][y] == 1 && !visited[x][y];
    }

    public static void main(String[] args) {

        int[][] maze = new int[][] {{1,0,1},{1,1,1},{1,1,1}};

        ArrayList<ArrayList<Integer>> paths = ratInAMaze(maze, 3);

        for (ArrayList<Integer> path : paths) {
            for(int i : path)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
