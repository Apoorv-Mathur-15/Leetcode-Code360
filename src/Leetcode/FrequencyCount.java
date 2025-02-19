package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

    public static void frequency(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 3, 7, 5, 2, 4, 9, 9, 9, 9};
        frequency(arr);
    }
}
