package src.CodingNinja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
    public static int findDuplicate(ArrayList<Integer> arr) {
        int res = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr)
            map.put(i, map.getOrDefault(i, 0) + 1);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 2)
                res = entry.getKey();
        }
        return res;
    }
}
