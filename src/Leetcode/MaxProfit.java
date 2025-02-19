package src.Leetcode;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxPro = Math.max(maxPro, prices[i] - minPrice);
        }
        return maxPro;
    }

    public static void main(String[] args) {
        int[] arr = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(arr));
    }
}
