package src.CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSubarraySum {
    public static int maximumSubarraySum(int n, ArrayList<Integer> v) {
        v.sort(Integer::compare);
        long sum = 0;
        long maxSum = 0;

        for (int i = 0; i < n; i++) {
            if (v.get(i) > 0) {
                sum += v.get(i); // Add positive numbers to the sum
            }
        }

        return (int) sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>(Arrays.asList(1, -5, 1, 1, -4));
        ArrayList<Integer> v1 = new ArrayList<>(Arrays.asList(1, 0, -1, 0, 1));
        System.out.println(maximumSubarraySum(v.size(), v));
        System.out.println(maximumSubarraySum(v.size(), v1));
    }
}
