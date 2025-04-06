package src.CodingNinja;

import java.util.HashMap;

public class CountOddEven {
    public static int[] countEvenOdd(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int[] counts = new int[2];
        map.forEach((key, value) -> {
            if(value % 2 == 0)
                counts[1]++;
            else
                counts[0]++;
        });
        return counts;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,1,2,1,5,5,2};
        int[] result = countEvenOdd(arr, arr.length);
        System.out.println(result[0]+" "+result[1]);
    }
}
