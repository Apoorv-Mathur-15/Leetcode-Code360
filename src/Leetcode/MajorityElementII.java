package src.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class MajorityElementII {

    public static List<Integer> majorityElement(int[] arr) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr)
            map.put(i, map.getOrDefault(i, 0) + 1);
        int n = arr.length / 3;
        for(Map.Entry<Integer, Integer> entrySet : map.entrySet()){
            if(entrySet.getValue() > n)
                list.add(entrySet.getKey());
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1};
        int[] arr1 = {3, 2, 3};
        System.out.println(majorityElement(arr));
        System.out.println(majorityElement(arr1));
    }
}
