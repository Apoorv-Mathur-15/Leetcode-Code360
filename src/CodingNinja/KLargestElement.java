package src.CodingNinja;

import java.util.Arrays;

public class KLargestElement {
    public static int[] Klargest(int[] a, int k, int n) {
        Arrays.sort(a);
        int[] result = new int[k];
        for(int i = n ; i > n-k; i--) {
            result[n-i] = a[i-1];
        }
        Arrays.sort(result);
        return result;
    }

    static void main(String[] args) {
        int[] a = new int[]{-2,12,-1,1,20,1};
        int[] result = Klargest(a, 2, a.length);
        for(int i : result)
            System.out.print(i+" ");
    }
}
