package src.CodingNinja;

import java.util.ArrayList;
import java.util.List;

public class InfiniteArraySum {

    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {
        List<Integer> result = new ArrayList<>();
        int totalSum = 0;  // Compute the sum of the whole array once
        for (int num : arr) {
            totalSum += num;
        }
        long[] prefixSum = new long[n + 1]; // Prefix sum array

        // Compute prefix sum
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }

        for (List<Long> query : queries) {
            int start = (int) (query.get(0) - 1); // Convert to 0-based index
            int end = (int) (query.get(1) - 1);

            long sum = 0;
            if (end / n == start / n) { // If both are in the same cycle
                sum = prefixSum[ (end % n) + 1] - prefixSum[ (start % n)];
            } else { // If spans multiple cycles
                long fullCycles = (end / n) - (start / n) - 1;
                sum += (fullCycles * totalSum); // Sum of full cycles

                // Add the remaining part of the first cycle
                sum += prefixSum[n] - prefixSum[ (start % n)];

                // Add the beginning part of the last cycle
                sum += prefixSum[ (end % n) + 1];
            }
            result.add((int) sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 9};
        List<List<Long>> queries = new ArrayList<>();

        queries.add(List.of(1L, 5L));
        queries.add(List.of(10L, 13L));
        queries.add(List.of(7L, 11L));

        List<Integer> result = sumInRanges(arr, arr.length, queries, queries.size());
        System.out.println(result);
    }
}
