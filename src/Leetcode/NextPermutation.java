package src.Leetcode;

public class NextPermutation {

    public static void nextPermutation(int[] arr) {
        int index = arr.length - 2;
        while (index >= 0 && arr[index] >= arr[index + 1]) {
            index--;
        }

        if (index >= 0) {
            int larger = arr.length - 1;
            while (larger >= 0 && arr[larger] <= arr[index]) {
                larger--;
            }
            swap(arr, index, larger);
        }

        reverse(arr, index + 1);
        for (int i : arr)
            System.out.print(i + " ");
    }

    private static void reverse(int[] arr, int start) {
        int i = start, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 1};
        nextPermutation(arr);
    }
}
