package src.Leetcode;

public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {
        long l = 0, h = num;
        while (l < h) {
            long m = l + (h - l) / 2;
            long expected_sq = m * m;
            long next_sq = (m + 1) * (m + 1);
            System.out.println("expected_sq= " + expected_sq + " & next_sq= " + next_sq);
            if (expected_sq == num || next_sq == num)
                return true;
            else if (expected_sq < num && next_sq > num)
                return false;
            else if (expected_sq < num)
                l = m + 1;
            else
                h = m - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(100));
    }
}
