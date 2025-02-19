package src.CodingNinja;

import java.util.Arrays;

public class LargestElementArray {

    static int largestElement(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 16, 156, 1566, 189, 56, 16512};
        System.out.println(largestElement(arr, arr.length));
    }
}
