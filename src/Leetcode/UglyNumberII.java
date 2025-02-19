package Leetcode;

public class UglyNumberII {
    public static int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        int i2 = 0, i3 = 0, i5 = 0, ugly2 = 2, ugly3 = 3, ugly5 = 5, nextUgly;
        ugly[0] = 1;
        for (int i = 1; i < n; i++) {
            nextUgly = Math.min(Math.min(ugly2, ugly3), ugly5);
            ugly[i] = nextUgly;
            if (nextUgly == ugly2) {
                i2++;
                ugly2 = ugly[i2] * 2;
            }
            if (nextUgly == ugly3) {
                i3++;
                ugly3 = ugly[i3] * 3;
            }
            if (nextUgly == ugly5) {
                i5++;
                ugly5 = ugly[i5] * 5;
            }
        }
        return ugly[n - 1];
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println("nth Ugly Number for n = " + n + " is : " + nthUglyNumber(n));
    }
}
