package Leetcode;

public class MaxSubArray {
    public static int maxSubArray(int[] arr) {
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max)
                max = sum;
            if (sum < 0)
                sum = 0;
        }
        return (int) max;
    }

    public static void main(String[] args) {
        int[] arr = {-7, -8, -16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16, -10};
        System.out.println(maxSubArray(arr));
    }
}
