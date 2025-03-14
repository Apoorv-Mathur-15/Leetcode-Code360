package src.CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumII {

    public static ArrayList<ArrayList<Integer>> findTriplets(int[] nums, int n, int k) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == k) {
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    while (left < right && nums[left] == nums[left + 1])
                        left++;
                    while (left < right && nums[right] == nums[right - 1])
                        right--;
                    left++;
                    right--;
                } else if (sum < k) {
                    left++;
                } else
                    right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        ArrayList<ArrayList<Integer>> result = findTriplets(nums, nums.length, 6);
        for(ArrayList<Integer> resultSet : result){
            for(int i : resultSet)
                System.out.print(i+" ");
            System.out.println();
        }

    }
}
