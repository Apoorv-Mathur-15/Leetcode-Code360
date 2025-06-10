package src.CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastPosition {
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int[] result = new int[]{-1, -1};

        // Find first occurrence
        int low = 0;
        int high = n - 1;
        int firstOccurrence = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == k) {
                firstOccurrence = mid;
                high = mid - 1; // Look for an earlier occurrence
            } else if (arr.get(mid) < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        result[0] = firstOccurrence;

        // If k is not found, no need to search for last occurrence
        if (firstOccurrence == -1) {
            return result;
        }

        // Find last occurrence
        low = 0;
        high = n - 1;
        int lastOccurrence = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == k) {
                lastOccurrence = mid;
                low = mid + 1; // Look for a later occurrence
            } else if (arr.get(mid) < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        result[1] = lastOccurrence;

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,3,4,4,5,6));
        int[] result = firstAndLastPosition(list, 6, 5);
        for(int i : result)
            System.out.println(i);
    }
}
