package CodingNinja;

public class SquareRoot {

    public static int mySqrt(int n) {
        if (n == 0)
            return n;
        long l = 1, r = n, m;
        while (l <= r) {
            m = l + (r - l) / 2;
            long nextSqrt = (m + 1) * (m + 1);
            long preSqrt = m * m;
            if ((preSqrt == n) || (preSqrt < n) && (nextSqrt > n))
                return (int) m;
            else if (preSqrt < n)
                l = m + 1;
            else
                r = m - 1;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2463523));
    }
}
