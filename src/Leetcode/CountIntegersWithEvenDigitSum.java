package Leetcode;

public class CountIntegersWithEvenDigitSum {
    public static int countEven(int num) {
        if (num % 2 == 1)
            return num / 2;
        else {
            int ans = 0, n = num;
            while (n != 0) {
                ans += n % 10;
                n /= 10;
            }
            if (ans % 2 == 0)
                return num / 2;
            else
                return num / 2 - 1;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(countEven(n));
    }
}
