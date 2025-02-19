package src.Leetcode;

public class TriangularSumOfArray {

    public static int triangularSum(int[] nums) {
        for (int len = nums.length - 1; len > 0; --len) {
            for (int i = 0; i < len; ++i) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Triangular Sum of the Array is: " + triangularSum(nums));
    }
}
