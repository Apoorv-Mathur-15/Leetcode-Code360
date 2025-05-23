package src.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> f = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; ++i) {
            f.add(1);
        }
        for (int i = 2; i < rowIndex + 1; ++i) {
            for (int j = i - 1; j > 0; --j) {
                f.set(j, f.get(j) + f.get(j - 1));
            }
        }
        return f;
    }

    public static void main(String[] args) {
        List<Integer> ans = getRow(3);
        for (int n : ans)
            System.out.print(n + " ");
    }
}
