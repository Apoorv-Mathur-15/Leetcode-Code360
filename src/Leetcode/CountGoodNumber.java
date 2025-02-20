package src.Leetcode;

public class CountGoodNumber {
    public static int countGoodNumber(long n) {
        long mod = 1000000007L;
        long result = n % 2 == 0 ? 1L : 5L;

        long base = 20L;
        long time = n / 2L;
        while (time > 0) {
            if (time % 2L > 0) {
                result *= base;
                result %= mod;
            }
            time /= 2L;
            base = base * base % mod;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(countGoodNumber(2582));
        System.out.println(countGoodNumber(3245));
        System.out.println(countGoodNumber(1));
        System.out.println(countGoodNumber(4));
        System.out.println(countGoodNumber(50));
    }
}
