package src.CodingNinja;

public class TrappingRainWater {
    public static long getTrappedWater(long[] arr, int n) {
        if (n < 3) {
            return 0;
        }
        long[] maxLeft = new long[n];
        long[] maxRight = new long[n];
        maxLeft[0] = arr[0];
        maxRight[n - 1] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], arr[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], arr[i]);
        }
        long totalWater = 0;
        for (int i = 0; i < n; i++) {
            totalWater += Math.min(maxLeft[i], maxRight[i]) - arr[i];
        }

        return totalWater;
    }

    public static void main(String[] args) {
        long[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Example 1 Output: " + getTrappedWater(height1, height1.length ));
        long[] height2 = {1, 1};
        System.out.println("Example 2 Output: " + getTrappedWater(height2, height2.length ));
        long[] height3 = {4, 3, 2, 1, 4};
        System.out.println("Example 3 Output: " + getTrappedWater(height3, height3.length));
        long[] height4 = {1, 2, 1};
        System.out.println("Example 4 Output: " + getTrappedWater(height4, height4.length));
    }
}
