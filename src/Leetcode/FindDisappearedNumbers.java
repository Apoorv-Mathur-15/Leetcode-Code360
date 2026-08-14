package src.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int count = 0;
        int[] arr = new int[nums.length];
        if (nums == null || nums.length == 0)
            return result;
        for (int i = 0; i < nums.length; i++) {
            arr[nums[count] - 1] = 1;
            count++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                result.add(i+1);
            }
        }
        return result;
    }

    static void main() {
        System.out.println(findDisappearedNumbers(new int[]{1,2,3,4,1,6,2,2,1}));
    }
}
