package src.Leetcode;

public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        boolean isNegative = dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0;
        long ans = 0;
        long divide = Math.abs((long) dividend);
        long divisorAbs = Math.abs((long) divisor);
        while (divide >= divisorAbs) {
            long temp = divisorAbs;
            long count = 1;
            while (divide >= temp) {
                divide -= temp;
                ans += count;
                count <<= 1;
                temp <<= 1;
            }
        }
        if (isNegative) {
            ans = -ans;
        }
        int Min = -(1 << 31);
        int Max = (1 << 31) - 1;
        if (ans < Min || ans > Max) {
            ans = Max;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int num1 = 10, num2 = 7, num3 = -2147483648;
        int div1 = 3, div2 = -3, div3 = -1;
        System.out.println(divide(num1, div1));
        System.out.println(divide(num2, div2));
        System.out.println(divide(num3, div3));
    }
}
