package src.Leetcode;

public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if (n < 0) return false;
        if (n == 1 || n == 2) return true;
        if (n == 3 ) return false;
        while (n > 3) {
            if (n % 4 != 0) return false;
            n /= 4;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(1));
        System.out.println(isPowerOfFour(3));
        System.out.println(isPowerOfFour(1048576));
    }
}
