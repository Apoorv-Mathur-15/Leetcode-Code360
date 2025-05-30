package src.CodingNinja;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubArrayWithZeroSumII {
    public static int LongestSubsetWithZeroSum(int[] arr){
        // HashMap to store the prefix sum and its first occurrence index
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

        // Variable to store the current prefix sum
        int currentSum = 0;

        // Variable to store the length of the longest subarray with sum zero
        int maxLength = 0;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Update the current prefix sum
            currentSum += arr[i];

            // If the current sum is zero, the subarray from index 0 to i has a sum of zero
            if (currentSum == 0) {
                maxLength = i + 1;
            }

            // If the current sum has been seen before, calculate the length of subarray
            // between the previous index and the current index
            if (prefixSumMap.containsKey(currentSum)) {
                int previousIndex = prefixSumMap.get(currentSum);
                maxLength = Math.max(maxLength, i - previousIndex);
            } else {
                // Store the first occurrence of the current prefix sum
                prefixSumMap.put(currentSum, i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,-1,4,-4};
        System.out.println(LongestSubsetWithZeroSum(arr));
    }
}
