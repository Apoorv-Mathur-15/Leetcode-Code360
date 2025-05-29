package src.Leetcode;

public class MinCuttingCost {

    public static long minCuttingCost(int n, int m, int k) {
        if( n == 0 || m == 0 || k == 0)
            return 0;
        long ans = 0;
        if (m <= k && n <= k) {
            return 0;
        }
        if (m > k && n <= k) {
            ans += (long) (m - k) * k;
        }
        if (n > k && m <= k) {
            ans += (long) (n - k) * k;
        }
        return ans;
    }

    // Test the code
    public static void main(String[] args) {
        System.out.println(minCuttingCost(10, 5, 6)); // Expected: minimal cutting cost
        System.out.println(minCuttingCost(1, 2, 2)); // Expected: minimal cutting cost
        System.out.println(minCuttingCost(1, 4, 3)); // Expected: minimal cutting cost
    }
}
