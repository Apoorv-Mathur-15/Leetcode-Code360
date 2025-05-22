package src.CodingNinja;

public class TotalIslands {
    static int[] dx = {-1,-1,-1,0,0,1,1,1};
    static int[] dy = {-1,0,1,-1,1,-1,0,1};
    public static int getTotalIslands(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        boolean[][] visited = new boolean[n][m];
        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j] == 1 && !visited[i][j]){
                    dfs(mat, visited, i, j, n, m);
                    count++;
                }
            }
        }
        return count;
    }

    private static void dfs(int[][] mat, boolean[][] visited, int x, int y, int n, int m) {
        visited[x][y] = true;
        for (int dir = 0; dir<8; dir++){
            int X = x + dx[dir];
            int Y = y + dy[dir];

            if(isSafe(mat, visited, X, Y, n, m))
                dfs(mat, visited, X, Y, n, m);
        }
    }

    private static boolean isSafe(int[][] mat, boolean[][] visited, int x, int y, int n, int m) {
        return (x >= 0 && x < n && y >= 0 && y < m && mat[x][y] == 1 && !visited[x][y]);
    }

    public static void main(String[] args) {
        int[][] mat = new int[4][5];
        mat[0] = new int[]{0,1,1,0,0};
        mat[1] = new int[]{1,0,0,1,0};
        mat[2] = new int[]{0,0,1,0,0};
        mat[3] = new int[]{1,0,0,0,1};

        System.out.println(getTotalIslands(mat));
    }
}
