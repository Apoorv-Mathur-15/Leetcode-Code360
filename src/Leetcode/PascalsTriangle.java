package src.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static int nCr(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

    public static List<List<Integer>> generate(int rows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int row = 1; row <= rows; row++) {
            List<Integer> integerList = new ArrayList<>();
            for (int col = 1; col <= rows; col++) {
                int num = nCr(row - 1, col - 1);
                if (num != 0)
                    integerList.add(num);
            }
            ans.add(integerList);
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = generate(5);
        for (List<Integer> list : ans) {
            for (int n : list)
                System.out.print(n + " ");
            System.out.println();
        }
    }
}
