package src.CodingNinja;

import java.util.HashSet;

public class TwoSum {
    public static boolean twoSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String args[]) {
        int nums[] = new int[]{2, 7, 11, 15};
        boolean result = twoSum(nums, 9);
        System.out.println(result);
    }
}
