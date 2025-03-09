package src.CodingNinja;

import java.util.HashMap;
import java.util.Map;

public class FindMajorityElement {
    public static int findMajority(int[] arr, int n) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : arr) {
            if (hashMap.containsKey(i))
                hashMap.put(i, hashMap.get(i) + 1);
            else
                hashMap.put(i, 1);
        }
        int floor = n/2;
        for(Map.Entry<Integer, Integer> map : hashMap.entrySet()){
            if(map.getValue() > floor)
                return map.getKey();
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,9,2,2};
        int[] nums1 = {8,5,1,9};
        System.out.println(findMajority(nums1, nums1.length));
        System.out.println(findMajority(nums, nums.length));
    }
}
