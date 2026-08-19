package src.Leetcode;

import java.util.HashMap;

public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i :  nums)
            map.put(i, map.getOrDefault(i, 0) + 1);
        int sum = 0;
        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            //System.out.println("Key, Sum: " + key + " " + sum);
            if(map.containsKey(key + 1))
                sum = Math.max(sum, map.get(key + 1) +  entry.getValue());
            //System.out.println("Sum: " + sum);
        }
        return sum;
    }

    static void main() {
        System.out.println(findLHS(new int[]{1,3,2,2,5,2,3,7}));
        System.out.println(findLHS(new int[]{1,2,3,4}));
        System.out.println(findLHS(new int[]{1,1,1,1}));
    }
}
