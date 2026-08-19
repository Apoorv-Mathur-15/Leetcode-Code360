package src.Leetcode;

import java.util.HashMap;

public class ContinuousSubarraySum {
    public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;
            if (map.containsKey(remainder)) {
                if(map.get(remainder) + 1 < i)
                    return true;
            }
            else
                map.put(remainder, i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println(checkSubarraySum(nums, 2));
        System.out.println(checkSubarraySum(nums, 3));
        System.out.println(checkSubarraySum(nums, 4));
        System.out.println(checkSubarraySum(nums, 5));
        System.out.println(checkSubarraySum(nums, 110));
    }
}
