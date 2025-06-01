package src.CodingNinja;

public class SwapNumber {
    public static void swapNumber(int[] a, int[] b) {
        int temp = a[0];
        a[0] = b[0];
        b[0] = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
