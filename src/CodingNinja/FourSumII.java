package src.CodingNinja;

import java.util.Arrays;

public class FourSumII {
    public static String fourSum(int[] nums, int target, int n) {
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int k = j + 1, l = n - 1;
                while (k < l) {
                    long sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target)
                        return "Yes";
                    else if (sum < target)
                        k++;
                    else
                        l--;
                }
            }
        }
        return "No";
    }
}
