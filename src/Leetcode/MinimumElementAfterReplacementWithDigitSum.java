package src.Leetcode;

public class MinimumElementAfterReplacementWithDigitSum {
    public static int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int x : nums) {
            min = Math.min(min, solve(x));
        }
        return min;
    }

    private static int solve(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {999, 19, 199, 1345};
        System.out.println(minElement(nums));
    }
}
