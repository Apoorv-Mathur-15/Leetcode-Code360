package Leetcode;

public class FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid + 1] > nums[mid])
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(nums));
    }
}
