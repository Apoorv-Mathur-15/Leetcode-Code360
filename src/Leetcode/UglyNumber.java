package Leetcode;

public class UglyNumber {

    public static boolean isUgly(int n) {
        if (n == 1)
            return true;
        else if (n <= 0)
            return false;
        int[] factors = {2, 3, 5};
        for (int i : factors) {
            while (n > 1 && n % i == 0)
                n /= i;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println("Is " + n + " an ugly number?: " + isUgly(n));
    }
}
