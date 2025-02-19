package CodingNinja;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumsK {
    public static int findAllSubarraysWithGivenSum(int[] nums, int k) {
        int tempSum = 0, count = 0;
        Map<Integer, Integer> sumCount = new HashMap<>();
        sumCount.put(0, 1);
        for (int i : nums) {
            tempSum += i;
            if (sumCount.containsKey(tempSum - k))
                count += sumCount.get(tempSum - k);
            if (sumCount.get(tempSum) != null)
                sumCount.put(tempSum, sumCount.get(tempSum) + 1);
            else
                sumCount.put(tempSum, 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1};
        int[] nums2 = {1, 2, 3};
        System.out.println(findAllSubarraysWithGivenSum(nums1, 2));
        System.out.println(findAllSubarraysWithGivenSum(nums2, 3));
    }
}
