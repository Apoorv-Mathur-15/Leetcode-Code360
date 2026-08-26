package src.Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class KthLargestElementInArray {
    public static int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k > nums.length)
            return -1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);
        List<Integer> sortedKeys = new ArrayList<Integer>(map.keySet());
        sortedKeys.sort(Collections.reverseOrder());
        int curr = 0;
        for(int key : sortedKeys) {
            int freq = map.get(key);
            curr += freq;
            if(curr >= k)
                return key;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4}, 2));
        System.out.println(findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }
}
