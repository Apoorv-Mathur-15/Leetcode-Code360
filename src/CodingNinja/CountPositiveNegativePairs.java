package src.CodingNinja;

import java.util.HashMap;

public class CountPositiveNegativePairs {
    public static long countPositiveNegativePairs(int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        long count = 0;
        for(int i : arr)
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);

        for(int num : hashMap.keySet()){
            if(num > 0 && hashMap.containsKey(-num))
                count += (long) hashMap.get(num) * hashMap.get(-num);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPositiveNegativePairs(new int[]{-1, 3, 6, 2, 5, -4, 3, 2, -4 }));
        System.out.println(countPositiveNegativePairs(new int[]{-2, 8, 2, 5, -2, -5}));
    }
}
