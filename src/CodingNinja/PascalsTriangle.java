package CodingNinja;

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

    public static int[][] generate(int rows) {
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
        int[][] result = new int[ans.size()][ans.size()];
        int i = 0, j = 0;
        for (List<Integer> list : ans) {
            for (int n : list) {
                result[i][j] = n;
                j++;
                System.out.println("j = " + j + " , n = " + n);
            }
            System.out.println();
            System.out.println("i & j = " + i + " & " + j);
            j = 0;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] ans = generate(5);
        /*for(int[] a1 : ans ){
            for (int n : a1)
                System.out.print(n+" ");
            System.out.println();
        }*/
    }
}
