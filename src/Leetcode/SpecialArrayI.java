package Leetcode;

public class SpecialArrayI {

    public static boolean isSpecialArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] % 2 == 1 && nums[i] % 2 == 1)
                return false;
            if (nums[i - 1] % 2 == 0 && nums[i] % 2 == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 2};
        System.out.println(isSpecialArray(nums));
    }
}
