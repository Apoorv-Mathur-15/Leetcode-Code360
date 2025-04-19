package src.CodingNinja;

import java.util.ArrayList;

public class SearchGrid {

    public static boolean searchGrid(ArrayList<ArrayList<Integer>> mat, int n, int m, int target) {
        int row = 0;
        int col = m - 1;

        while (row < n && col >= 0) {
            int current = mat.get(row).get(col);
            if (current == target) {
                return true;
            } else if (current > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
