package src.Leetcode;

public class FirstMissingPositive {
    public static int firstMissing(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            // Swap until the element is in the correct position or out of bounds
            while (arr[i] > 0 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                // Swap arr[i] and arr[arr[i] - 1]
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }
        }

        // Step 2: Find the first index where arr[i] != i + 1
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1; // The missing number is i + 1
            }
        }

        // If all positions are correctly filled, then the missing number is n + 1
        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr = {-3, -1, 1, 3};
        System.out.println(firstMissing(arr, 4));
    }
}
