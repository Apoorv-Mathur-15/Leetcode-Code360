package src.CodingNinja;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicateII {
    public static boolean checkDuplicate(int[] arr, int n, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);

            // Keep the set size within the sliding window of size k
            if (set.size() > k) {
                set.remove(arr[i - k]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkDuplicate(new int[]{1, 2, 3, 4, 5, 6, 5, 4, 3}, 9, 5)); // true
        System.out.println(checkDuplicate(new int[]{1, 2, 3, 4, 5, 6, 3, 4, 5}, 9, 1)); // false
    }
}
