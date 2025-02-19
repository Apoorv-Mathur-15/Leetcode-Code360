package CodingNinja;

import java.util.Arrays;

public class GetSecondFromArray {
    public static int[] getSecondOrderElements(int n, int[] a) {
        Arrays.sort(a);
        int final_array[] = {a[n - 2], a[1]};
        return final_array;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 30, 0, 51, 1563, 7};
        int result[] = getSecondOrderElements(arr.length, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Second Largest Number: " + result[0]);
        System.out.println("Second Smalled Number: " + result[1]);
    }
}
