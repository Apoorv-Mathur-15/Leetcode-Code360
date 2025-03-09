package src.CodingNinja;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {
    public static int maxFrequencyNumber(int n, int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i : arr){
            if(hashMap.containsKey(i))
                hashMap.put(i, hashMap.get(i) + 1);
            else
                hashMap.put(i, 1);
        }
        int max = Integer.MIN_VALUE, num = 0;
        for(Map.Entry<Integer, Integer> map : hashMap.entrySet()){
            if( map.getValue() == max ){
                int index1 = traverse(arr, num);
                int index2 = traverse(arr, map.getKey());
                if( index1 > index2 )
                    num = map.getKey();
            }
            else if ( map.getValue() > max ){
                num = map.getKey();
                max = map.getValue();
            }
            System.out.println(num);
        }
        if(max == 1)
            return arr[0];
        System.out.println("Max: "+max);
        return num;
    }
    private static int traverse(int[] arr, int n){
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == n){
                System.out.println("Index: " +i);
                return i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {59, 64, 59, 54, 53, 50, 56, 54, 58, 51, 64, 54, 63, 65, 50, 61, 61, 63, 65, 58, 50, 52, 55, 60, 64};
        System.out.println(maxFrequencyNumber(arr.length, arr));
    }
}
