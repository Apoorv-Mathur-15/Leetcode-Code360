package src.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {
    public static int findShortestSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, num = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                num = entry.getKey();
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == num) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }
        return max - min + 1;
    }
    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{1,2,2,3,1,4,2}));
        System.out.println(findShortestSubArray(new int[]{1,2,2,3,1}));
    }
}
