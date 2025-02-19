package CodingNinja;

public class LeftRotateArray {
    static int[] rotateArray(int[] arr, int n) {
        int last = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = last;
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {10, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int result[] = rotateArray(arr, arr.length);
        System.out.println("\nRotated Array:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
