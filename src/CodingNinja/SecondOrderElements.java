package src.CodingNinja;

import java.util.Arrays;

public class SecondOrderElements {
    public static int[] getSecondOrderElements(int n, int[] a) {
        Arrays.sort(a);
        return new int[]{a[a.length-2], a[1]};
    }
}
