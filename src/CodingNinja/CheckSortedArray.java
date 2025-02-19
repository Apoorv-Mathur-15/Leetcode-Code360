package src.CodingNinja;

public class CheckSortedArray {
    public static int isSorted(int n, int[] a) {
        if (n == 0 || n == 1)
            return 1;
        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] < a[i])
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {

    }
}
