package src.Leetcode;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int singleNumber = 0;
        for (int num : nums)
            singleNumber ^= num;
        return singleNumber;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums));
    }
}
