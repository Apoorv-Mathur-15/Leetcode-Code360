package src.CodingNinja;

public class IsPerfectSquare {
    public static boolean isPerfectSquare(long n) {
        if (n == 0)
            return false;
        long l = 1, r = n, m;
        while (l <= r) {
            m = l + (r - l) / 2;
            long nextSqrt = (m + 1) * (m + 1);
            long preSqrt = m * m;
            if (preSqrt == n)
                return true;
            else if ((preSqrt != n) && (preSqrt < n) && (nextSqrt > n) )
                return false;
            else if (preSqrt < n)
                l = m + 1;
            else
                r = m - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Is "+ 21 + " a perfect square? " + isPerfectSquare(21));
        System.out.println("Is "+ 64 + " a perfect square? " + isPerfectSquare(64));
    }
}
