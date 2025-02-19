package src.Leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }
        Arrays.sort(nums);
        int n = nums.length;
        int sum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] + nums[n - 1] + nums[n - 2] < target) {
                sum = nums[i] + nums[n - 1] + nums[n - 2];
                continue;
            }
            if (nums[i] + nums[i + 1] + nums[i + 2] > target) {
                int temp = nums[i] + nums[i + 1] + nums[i + 2];
                return lessGap(sum, temp, target);
            }
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int temp = nums[i] + nums[j] + nums[k];
                if (temp == target) {
                    return target;
                }
                if (temp < target) {
                    j++;
                } else {
                    k--;
                }
                sum = lessGap(sum, temp, target);
            }
        }
        return sum;
    }

    private static int lessGap(int sum, int temp, int target) {
        return Math.abs(sum - target) < Math.abs(temp - target) ? sum : temp;
    }

    public static void main(String[] args) {
        int[] nums1 = {-1, 2, 1, 4};
        int[] nums2 = {0, 0, 0};
        int[] nums3 = {1, 1, 1, 1};
        int[] nums4 = {4, 0, 5, -5, 3, 3, 0, -4, -5};
        System.out.println(threeSumClosest(nums1, 1));
        System.out.println(threeSumClosest(nums2, 1));
        System.out.println(threeSumClosest(nums3, 3));
        System.out.println(threeSumClosest(nums4, -2));
    }
}
