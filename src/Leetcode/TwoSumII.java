package src.Leetcode;

public class TwoSumII {
    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        int nums[] = new int[]{2, 7, 11, 15};
        int result[] = twoSum(nums, 9);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
