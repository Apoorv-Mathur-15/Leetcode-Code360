package src.CodingNinja;

import java.util.Deque;
import java.util.LinkedList;

public class PrintSubArrayMax {
    public static void printSubArrayMax(int[] arr, int n, int k){
        if (arr == null || n == 0 || k > n || k <= 0) {
            return;
        }

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Remove indices out of current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove indices whose values are less than current element
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offerLast(i);

            // Print the max of the current window
            if (i >= k - 1) {
                System.out.print(arr[deque.peekFirst()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        printSubArrayMax(new int[]{10,5,2,7,8,7}, 6, 3);
    }
}
