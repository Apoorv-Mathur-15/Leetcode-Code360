package src.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i :  nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,3,2}));
    }
}
