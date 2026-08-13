package src.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);
        return  result;
    }

    private static void backtrack(int[] nums, int start, List<List<Integer>> result) {
        if(start == nums.length){
            List<Integer> currentPerm = new ArrayList<>();
            for(int num : nums ){
                currentPerm.add(num);
            }
            result.add(currentPerm);
            return;
        }
        for(int i = start; i < nums.length; i++){
            swap(nums, start, i);
            backtrack(nums, start + 1, result);
            swap(nums, start, i);
        }
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void main() {
        int[] arr = {1, 1, 2};
        List<List<Integer>> allPermutations = permute(arr);
        System.out.println(allPermutations);
    }
}
