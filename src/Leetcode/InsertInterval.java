package src.Leetcode;

import java.util.Arrays;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int l = 0, r = n - 1;
        while (l < n && newInterval[0] > intervals[l][1]) {
            l++;
        }
        while (r >= 0 && newInterval[1] < intervals[r][0]) {
            r--;
        }
        int[][] res = new int[l + n - r][2];
        System.out.println("l, r: " + l + " " + r);
        for (int i = 0; i < l; i++)
            res[i] = Arrays.copyOf(intervals[i], intervals[i].length);
        System.out.println("res: " + Arrays.deepToString(res));
        res[l][0] = Math.min(newInterval[0], l == n ? newInterval[0] : intervals[l][0]);
        res[l][1] = Math.max(newInterval[1], r == -1 ? newInterval[1] : intervals[r][1]);
        System.out.println("res: " + Arrays.deepToString(res));
        for (int i = l + 1, j = r + 1; j < n; j++, i++) {
            res[i] = intervals[j];
            System.out.println("res: " + Arrays.deepToString(res));
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{2,5},{6,7},{8,10}};
        int[] newInterval = new int[]{0,1};
        int[][] res = insert(intervals, newInterval);
        for(int[] i : res){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
