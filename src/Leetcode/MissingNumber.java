package Leetcode;

public class MissingNumber {

    public static int missingNumber(int[] num) {
        int n = num.length;
        int expected_sum = n * (n + 1) / 2;
        int sum = 0;
        for (int nums : num)
            sum += nums;
        return expected_sum - sum;
    }

    public static void main(String[] args) {

    }
}
