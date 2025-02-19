package Leetcode;

public class SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int[][] spiral = new int[n][n];
        int num = 1, rStart = 0, rEnd = n - 1, cStart = 0, cEnd = n - 1;
        while (rStart <= rEnd && cStart <= cEnd) {
            for (int i = cStart; i <= cEnd; i++) {
                spiral[rStart][i] = num++;
            }
            rStart++;
            for (int i = rStart; i <= rEnd; i++) {
                spiral[i][cEnd] = num++;
            }
            cEnd--;
            if (rStart <= rEnd) {
                for (int i = cEnd; i >= cStart; i--) {
                    spiral[rEnd][i] = num++;
                }
            }
            rEnd--;
            if (cStart <= cEnd) {
                for (int i = rEnd; i >= rStart; i--) {
                    spiral[i][cStart] = num++;
                }
            }
            cStart++;
        }
        return spiral;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] matrix;
        matrix = generateMatrix(n);
        System.out.println("Before:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
