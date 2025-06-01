package src.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            Integer index = map.put(nums[i], i);
            System.out.println("index: " + index);
            if (index != null && Math.abs(i - index) <= k) {
                System.out.println("i " + i);
                System.out.println("index inside " + index);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3};
        System.out.println(containsNearbyDuplicate(nums, 2));
        int[] nums2 = {1, 2, 3, 1};
        System.out.println("Second Case");
        System.out.println(containsNearbyDuplicate(nums2, 3));
    }
}
