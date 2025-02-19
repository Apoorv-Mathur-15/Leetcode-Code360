package src.CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNonDuplicate {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int one = 0;
        for (int i : arr) {
            if (hashMap.containsKey(i))
                hashMap.put(i, hashMap.get(i) + 1);
            else
                hashMap.put(i, 1);
        }
        for (Map.Entry map : hashMap.entrySet()) {
            if (map.getValue().equals(1))
                one = (int) map.getKey();
        }
        return one;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 4, 5, 5));
        System.out.println(singleNonDuplicate(arrayList));
    }
}
