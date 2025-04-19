package src.CodingNinja;

import java.util.ArrayList;
import java.util.HashSet;

public class ThreeSumIV {

    public static ArrayList<Integer> findTriplets(int[] nums, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = nums[i] + nums[j];
                if (set.contains(sum)) {
                    // Make sure the sum is at a different index
                    for (int k = 0; k < n; k++) {
                        if (k != i && k != j && nums[k] == sum) {
                            ArrayList<Integer> res = new ArrayList<>();
                            res.add(nums[i]);
                            res.add(nums[j]);
                            res.add(nums[k]);
                            return res;
                        }
                    }
                }
                int diff1 = nums[i] - nums[j];
                if (set.contains(diff1)) {
                    for (int k = 0; k < n; k++) {
                        if (k != i && k != j && nums[k] == diff1) {
                            ArrayList<Integer> res = new ArrayList<>();
                            res.add(nums[i]);
                            res.add(nums[j]);
                            res.add(nums[k]);
                            return res;
                        }
                    }
                }
                int diff2 = nums[j] - nums[i];
                if (set.contains(diff2)) {
                    for (int k = 0; k < n; k++) {
                        if (k != i && k != j && nums[k] == diff2) {
                            ArrayList<Integer> res = new ArrayList<>();
                            res.add(nums[i]);
                            res.add(nums[j]);
                            res.add(nums[k]);
                            return res;
                        }
                    }
                }
            }
        }
        return new ArrayList<>();
    }
}
