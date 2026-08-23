package src.Leetcode;

import java.util.Arrays;

public class MaximumGap {
    public static int maximumGap(int[] nums) {
        if(nums == null || nums.length == 1)
            return 0;
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length - 1; i++){
            max = Math.max(max, nums[i + 1] - nums[i]);
        }
        return max;
    }
}
