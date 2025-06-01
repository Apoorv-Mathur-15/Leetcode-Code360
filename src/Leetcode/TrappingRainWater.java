package src.Leetcode;

public class TrappingRainWater {
    public static long trap(int[] height) {
        int n = height.length;
        if (n < 3) {
            return 0;
        }
        long[] maxLeft = new long[n];
        long[] maxRight = new long[n];
        maxLeft[0] = height[0];
        maxRight[n - 1] = height[n - 1];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i]);
        }
        long totalWater = 0;
        for (int i = 0; i < n; i++) {
            totalWater += Math.min(maxLeft[i], maxRight[i]) - height[i];
        }

        return totalWater;
    }

    public static void main(String[] args) {
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Example 1 Output: " + trap(height1 ));
        int[] height2 = {1, 1};
        System.out.println("Example 2 Output: " + trap(height2 ));
        int[] height3 = {4, 3, 2, 1, 4};
        System.out.println("Example 3 Output: " + trap(height3));
        int[] height4 = {1, 2, 1};
        System.out.println("Example 4 Output: " + trap(height4));
    }
}
