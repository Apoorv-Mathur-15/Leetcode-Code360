package Leetcode;

public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Invalid Input, only positive number allowed");
        if (n <= 1)
            return n;
        if (n <= 3)
            return n == 3 ? 2 : 1;
        long start = 2, end = n / 2;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long coinsFilled = mid * (mid + 1) / 2;
            if (coinsFilled == n)
                return (int) mid;
            else if (coinsFilled < n)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return (int) end;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(8));
    }
}
