package src.CodingNinja;

import java.util.ArrayList;

public class PascalsTriangleII {
    public static int nCr(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Long> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                int number = nCr(i, j);
                list.add((long) number);
            }
            result.add(list);
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Long>> ans = printPascal(1);
        for(ArrayList<Long> a1 : ans ){
            for (Long n : a1)
                System.out.print(n+" ");
            System.out.println();
        }
    }
}
