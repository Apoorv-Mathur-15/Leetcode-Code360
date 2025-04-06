package src.CodingNinja;

import java.util.HashMap;
import java.util.Map;

public class GetSingleElement {
    public static int getSingleElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i : arr)
            map.put(i, map.getOrDefault(i, 0) + 1);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1))
                return entry.getKey();
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 7, 5, 2, 4, 9, 9, 9, 9};
        System.out.println(getSingleElement(arr));
    }
}
