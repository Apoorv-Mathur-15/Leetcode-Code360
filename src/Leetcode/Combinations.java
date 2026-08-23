package src.Leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if( n > 20 || k < 1 || k > n)
            return res;
        combinations(res, n, k, 1, new ArrayDeque<>());
        return res;
    }
    private static void combinations(List<List<Integer>> res, int n, int k, int s, ArrayDeque<Integer> q) {
        if(k == 0) {
            res.add(new ArrayList<>(q));
            return;
        }
        for(int i = s; i <= n - k + 1; i++) {
            q.push(i);
            combinations(res, n, k - 1, i + 1, q);
            q.pop();
        }
    }
    public static void main(String[] args) {
        System.out.println(combine(4, 2));
        System.out.println(combine(1, 1));
    }
}
