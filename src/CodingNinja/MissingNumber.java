package CodingNinja;

import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] a, int n) {
        int totalSum = 0;
        for (int i : a)
            totalSum = totalSum + i;
        int expectedSum = n * (n + 1) / 2;
        System.out.println(Arrays.stream(a).sum());
        return expectedSum - totalSum;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5, 6, 7, 8};
        System.out.println(missingNumber(a, 8));
    }
}
