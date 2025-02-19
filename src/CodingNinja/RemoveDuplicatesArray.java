package src.CodingNinja;

import java.util.HashSet;

public class RemoveDuplicatesArray {
    public static int removeDuplicates(int[] a, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(a[i]))
                continue;
            else
                set.add(a[i]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        System.out.println("Initial Length of the array: " + arr.length);
        System.out.println("Final length of the array: " + removeDuplicates(arr, arr.length));
    }
}
