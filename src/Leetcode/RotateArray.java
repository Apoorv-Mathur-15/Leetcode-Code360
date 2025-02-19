package Leetcode;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int t = n - (k % n);
        reverse(nums, 0, t - 1);
        reverse(nums, t, n - 1);
        reverse(nums, 0, n - 1);
    }

    private static void reverse(int[] nums, int l, int r) {
        while (l <= r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}
