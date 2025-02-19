package Leetcode;

public class MaxProfit2 {
    public static int maxProfit(int[] prices) {
        int maxPro = 0;
        for (int i = 1; i < prices.length; i++) {
            maxPro += Math.max(0, prices[i] - prices[i - 1]);
        }
        return maxPro;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }
}
