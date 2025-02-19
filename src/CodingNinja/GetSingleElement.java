package CodingNinja;

import java.util.HashMap;
import java.util.Map;

public class GetSingleElement {
    public static int getSingleElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);
        }
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
