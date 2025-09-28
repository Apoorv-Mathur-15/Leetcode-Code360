package src.CodingNinja;

public class CopyAndReplace {
    public static int[] copyAndReverse(int[] arr, int n) {
        int[] reverse = new int[n];
        for(int i=0; i<n; i++) {
            reverse[n-i-1] = arr[i];
        }
        return reverse;
    }
}
