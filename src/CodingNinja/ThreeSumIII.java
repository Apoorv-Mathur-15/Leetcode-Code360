package src.CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumIII {

    public static ArrayList<Integer> findTriplets(int[] arr, int n) {
        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Try to find a valid triplet
        for (int i = 2; i < n; i++) {
            // Target is arr[i], we need to find two numbers whose sum is arr[i]
            int target = arr[i];

            // Two-pointer approach to find pairs that sum up to arr[i]
            int left = 0, right = i - 1;
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == target) {
                    // If we found a valid triplet, return it
                    return new ArrayList<>(Arrays.asList(arr[left], arr[right], arr[i]));
                } else if (sum < target) {
                    // Move the left pointer to the right to increase the sum
                    left++;
                } else {
                    // Move the right pointer to the left to decrease the sum
                    right--;
                }
            }
        }

        // If no valid triplet is found, return an empty ArrayList
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        ArrayList<Integer> results = findTriplets(nums, nums.length);
        for(Integer result : results){
            System.out.println(result);
        }

    }
}
