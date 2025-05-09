package src.Leetcode;

import java.util.Arrays;

public class FindMinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

    private static int findMinUtil(int[] nums, int l, int r) {
        if (l == r) {
            return nums[l];
        }
        int mid = (l + r) / 2;
        if (mid == l && nums[mid] < nums[r]) {
            return nums[l];
        }
        if (mid - 1 >= 0 && nums[mid - 1] > nums[mid]) {
            return nums[mid];
        }
        if (nums[mid] < nums[l]) {
            return findMinUtil(nums, l, mid - 1);
        } else if (nums[mid] > nums[r]) {
            return findMinUtil(nums, mid + 1, r);
        }
        return findMinUtil(nums, l, mid - 1);
    }

    public static int findMin1(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        return findMinUtil(nums, l, r);
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(findMin(nums));
        System.out.println(findMin1(nums));
    }
}
