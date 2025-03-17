package src.CodingNinja;


import java.util.Arrays;

public class MergeSortedArraysII {
    public static int[] ninjaAndSortedArrays(int[] arr1, int[] arr2, int m, int n){
        Arrays.sort(arr1);
        for (int i = 0; i < m / 2; i++) {
            int temp = arr1[i];
            arr1[i] = arr1[m - 1 - i];
            arr1[m - 1 - i] = temp;
        }
        int j = 0;
        for (int i = 0; i < m && j < n; i++) {
            if (arr1[i] == 0) {
                arr1[i] = arr2[j++];
            }
        }
        Arrays.sort(arr1);
        return arr1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 0, 0};
        int[] b = {4, 5};
        int[] result = ninjaAndSortedArrays(a, b, a.length, b.length);
        for(int i : result)
            System.out.print(i + " ");
    }
}
