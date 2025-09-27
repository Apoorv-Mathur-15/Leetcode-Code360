package src.Leetcode;

public class TrailingZeroes {
    public static int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }

    static void main(String[] args) {
        System.out.println(trailingZeroes(30));
        System.out.println(trailingZeroes(10));
    }
}
