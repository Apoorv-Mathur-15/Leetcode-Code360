package src.Leetcode;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int distinctCount = 1;
        int previous = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != previous) {
                distinctCount++;
                previous = nums[i];

                if (distinctCount == 3) {
                    return nums[i];
                }
            }
        }
        // Fewer than 3 distinct numbers
        return nums[nums.length - 1];
    }
}
