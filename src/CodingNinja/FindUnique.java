package src.CodingNinja;

import java.util.HashMap;
import java.util.Map;

public class FindUnique {
    public static int findUnique(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr)
            map.put(i, map.getOrDefault(i, 0) + 1);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        return -1;
    }
}
