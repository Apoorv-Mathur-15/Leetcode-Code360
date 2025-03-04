package src.CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseTheArray {
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int left = m + 1;
        int right = arr.size() - 1;

        // Reverse the subarray between left and right
        while (left < right) {
            // Swap elements at left and right
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);
            left++;
            right--;
        }

        // Print the resulting array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        reverseArray(arr, 3);
    }
}
