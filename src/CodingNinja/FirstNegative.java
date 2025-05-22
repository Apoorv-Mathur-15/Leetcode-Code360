package src.CodingNinja;

import java.util.Deque;
import java.util.LinkedList;

public class FirstNegative {
    public static int[] firstNegative(int[] arr, int n, int k){
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        int index = 0;

        for(int i=0; i<n; i++){
            if(arr[i] < 0)
                deque.addLast(i);

            if(!deque.isEmpty() && deque.peekFirst() < i - k + 1)
                deque.pollFirst();

            if(i >= k - 1){
                if(!deque.isEmpty())
                    result[index++] = arr[deque.peekFirst()];
                else
                    result[index++] = 0;
            }
        }
        return result;
    }
}
