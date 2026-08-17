package src.Leetcode;

import java.util.HashMap;

public class FourSumII {
    public static int countFourSum(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        int n = nums1.length;
        if(nums1.length != nums2.length || nums2.length != nums3.length || nums3.length != nums4.length)
            return count;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int sum = nums1[i] + nums2[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int sum = nums3[i] + nums4[j];
                count += map.getOrDefault(-sum, 0);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countFourSum(new int[]{1,2},new int[]{-2,-1},new int[]{-1,2},new int[]{0,2}));
    }
}
