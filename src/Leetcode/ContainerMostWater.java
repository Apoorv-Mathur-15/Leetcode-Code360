package Leetcode;

public class ContainerMostWater {
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            maxArea = Math.max(maxArea, ((right - left) * Math.min(height[left], height[right])));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Example 1 Output: " + maxArea(height1));
        int[] height2 = {1, 1};
        System.out.println("Example 2 Output: " + maxArea(height2));
        int[] height3 = {4, 3, 2, 1, 4};
        System.out.println("Example 3 Output: " + maxArea(height3));
        int[] height4 = {1, 2, 1};
        System.out.println("Example 4 Output: " + maxArea(height4));
    }
}
