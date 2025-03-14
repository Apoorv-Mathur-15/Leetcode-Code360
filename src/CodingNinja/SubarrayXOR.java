package src.CodingNinja;

import java.util.ArrayList;
import java.util.HashMap;

public class SubarrayXOR {
    public static int subarraysXor(ArrayList<Integer> arr, int x) {
        int count = 0;
        int prefixXor = 0;

        // Create a HashMap to store the frequency of prefix XOR values
        HashMap<Integer, Integer> prefixXorCount = new HashMap<>();

        // Initialize the map with 0 -> 1 to handle the case when the prefixXor itself equals X
        prefixXorCount.put(0, 1);

        for (int num : arr) {
            // Update the prefix XOR up to the current element
            prefixXor ^= num;

            // Check if there exists a prefix XOR that satisfies the condition
            if (prefixXorCount.containsKey(prefixXor ^ x)) {
                count += prefixXorCount.get(prefixXor ^ x);
            }

            // Update the frequency of the current prefix XOR in the map
            prefixXorCount.put(prefixXor, prefixXorCount.getOrDefault(prefixXor, 0) + 1);
        }

        return count;
    }
}
