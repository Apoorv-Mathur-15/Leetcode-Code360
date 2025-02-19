package Leetcode;

public class SumOfAllOddLengthSubArrays {

    public static int sumOddLengthSubArrays(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            int totalSubArrays = (i + 1) * (n - i);
            int oddCount = (totalSubArrays + 1) / 2;
            totalSum += oddCount * arr[i];
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println("Sum of all odd-length subarrays: " + sumOddLengthSubArrays(arr));
    }
}
