package src.CodingNinja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : nums)333333333333333333333333
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        int n = Math.floorDiv(nums.length, 3);
        for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            if (map.getValue() > n)
                list.add(map.getKey());
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 3};
        int[] nums1 = {2, 2, 0, 1, 2, 1};
        List<Integer> list = majorityElement(nums1);
        for (int i : list)
            System.out.println(i + " ");
    }
}
