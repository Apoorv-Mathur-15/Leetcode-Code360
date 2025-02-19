package src.CodingNinja;

public class ReverseArray {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int[] reversearr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            reversearr[n - i - 1] = arr[i];
        }
        printArray(reversearr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
    }
}
