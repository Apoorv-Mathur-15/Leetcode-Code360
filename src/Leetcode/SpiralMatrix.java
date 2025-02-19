package src.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int rStart = 0, rEnd = m - 1, cStart = 0, cEnd = n - 1;
        while (rStart <= rEnd && cStart <= cEnd) {
            for (int i = cStart; i <= cEnd; i++) {
                ans.add(matrix[rStart][i]);
            }
            rStart++;
            for (int i = rStart; i <= rEnd; i++) {
                ans.add(matrix[i][cEnd]);
            }
            cEnd--;
            if (rStart <= rEnd) {
                for (int i = cEnd; i >= cStart; i--) {
                    ans.add(matrix[rEnd][i]);
                }
            }
            rEnd--;
            if (cStart <= cEnd) {
                for (int i = rEnd; i >= rStart; i--) {
                    ans.add(matrix[i][cStart]);
                }
            }
            cStart++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> ans = spiralOrder(matrix);
        for (int i : ans)
            System.out.print(i + " ");
        System.out.println();
        List<Integer> ans1 = spiralOrder(matrix1);
        for (int i : ans1)
            System.out.print(i + " ");
    }
}
