package src.Leetcode;

public class Power {
    public static double myPow(double x, int n) {
        long nn = n;
        double res = 1;
        if (n < 0) {
            nn *= -1;
        }
        while (nn > 0) {
            if (nn % 2 == 1) {
                nn--;
                res *= x;
            } else {
                x *= x;
                nn /= 2;
            }
        }
        if (n < 0) {
            return 1.0 / res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0, 10));
        System.out.println(myPow(2.1, 3));
        System.out.println(myPow(2.0, -2));
    }
}
