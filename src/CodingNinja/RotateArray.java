package src.CodingNinja;

import java.util.ArrayList;
import java.util.Collections;

public class RotateArray {

    public static void rotateLeft(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        k = k % n; // in case k > n

        if (k == 0) return;

        // Reverse first k elements
        reverse(arr, 0, k - 1);

        // Reverse remaining n - k elements
        reverse(arr, k, n - 1);

        // Reverse whole array
        reverse(arr, 0, n - 1);
    }

    private static void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1, 2, 3, 4, 5);

        int k = 2;
        rotateLeft(arr, k);

        System.out.println(arr); // Output: [3, 4, 5, 1, 2]
    }
}
