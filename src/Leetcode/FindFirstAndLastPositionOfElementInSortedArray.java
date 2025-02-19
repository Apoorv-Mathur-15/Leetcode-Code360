package src.Leetcode;

public class FindFirstAndLastPositionOfElementInSortedArray {

    public static int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int first = -1, last = -1;
        //First Occurrence
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                first = m;
                r = m - 1;
            } else if (target < nums[m]) {
                r = m - 1;
            } else
                l = m + 1;
        }
        //Last Occurrence
        l = 0;
        r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                last = m;
                l = m + 1;
            } else if (target < nums[m]) {
                r = m - 1;
            } else
                l = m + 1;
        }
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] output = new int[2];
        int target = 8;
        output = searchRange(nums, target);
        System.out.println("First Occurrence of " + target + " in the Sorted Array: " + output[0]);
        System.out.println("Last Occurrence of " + target + " in the Sorted Array: " + output[1]);
    }
}
