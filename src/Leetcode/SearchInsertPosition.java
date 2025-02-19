package src.Leetcode;

public class SearchInsertPosition {

    public static int searchInsert(int[] num, int target) {
        int l = 0, r = num.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (num[m] == target)
                return m;
            else if (num[m] > target)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }

    public static void main(String[] args) {

    }
}
