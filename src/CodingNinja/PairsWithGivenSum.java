package src.CodingNinja;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PairsWithGivenSum {
    public static long pairsWithGivenSum(int[] arr, int sum){
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i : arr)
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        long pairsCount = 0;
        Set<Integer> uniqueElements = new HashSet<>(frequencyMap.keySet());
        for(int num : uniqueElements){
            if(!frequencyMap.containsKey(num))
                continue;
            int complement = sum - num;
            if(uniqueElements.contains(complement)){
                if(num == complement) {
                    long n = frequencyMap.get(num);
                    pairsCount += (n* (n-1))/2;
                }
                else {
                    long countNum = frequencyMap.get(num);
                    long countComplement = frequencyMap.get(complement);
                    pairsCount += countNum * countComplement;
                    frequencyMap.remove(num);
                    frequencyMap.remove(complement);
                }
            }
        }
        return pairsCount;
    }
}
