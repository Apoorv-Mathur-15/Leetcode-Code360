package src.CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PairSum {
    public static List<int[]> pairSum(int[] nums, int target) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int[] result = new int[2];

            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    result[0] = nums[i];
                    result[1] = nums[j];
                    Arrays.sort(result);
                    list.add(result);
                }
            }
        }
        list.sort(Comparator.comparingInt(arr -> arr[0]));
        return list;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] nums1= new int[]{1,2,3,4,5};
        int[] nums2 = new int[]{2, -3, 3, 3, -2};
        //List<int[]> result = pairSum(nums, 9);
        //List<int[]> result1 = pairSum(nums1, 5);
        List<int[]> result2 = pairSum(nums2, 0);
        for(int[] arr : result2){
            System.out.print(arr[0] + " " + arr[1]);
            System.out.println();
        }
    }
}
