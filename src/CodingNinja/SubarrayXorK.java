package src.CodingNinja;

import java.util.HashMap;
import java.util.Map;

public class SubarrayXorK {
    public static int subarraysWithSumK(int []a, int b) {
        int xr = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(xr,1);
        int count = 0;
        for(int i : a){
            xr = xr ^ i;
            int x  = xr ^ b;
            if(map.containsKey(x))
                count += map.get(x);
            if(map.containsKey(xr))
                map.put(xr, map.get(xr) + 1);
            else
                map.put(xr, 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,2};
        int[] a1 = {1,2,3,3};
        int[] a2 = {1,3,3,3,5};
        System.out.println(subarraysWithSumK(a, 2));
        System.out.println(subarraysWithSumK(a1, 3));
        System.out.println(subarraysWithSumK(a2, 6));
    }
}
