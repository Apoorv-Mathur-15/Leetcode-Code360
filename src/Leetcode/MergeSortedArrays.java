package src.Leetcode;

public class MergeSortedArrays {

    public static void merge(int[] a, int m, int[] b, int n) {
        for (int i = m - 1, j = n - 1, k = m + n - 1; j >= 0; --k) {
            a[k] = i >= 0 && a[i] > b[j] ? a[i--] : b[j--];
        }
    }

    public static void main(String[] args) {
        int[] a = {0};
        int[] b = {1};
        merge(a, 0, b, 1);
    }
}
