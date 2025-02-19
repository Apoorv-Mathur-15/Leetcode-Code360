package src.CodingNinja;

import java.util.ArrayList;

public class MaxProfit {
    public static int maxProfit(ArrayList<Integer> prices) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.size(); i++) {
            minPrice = Math.min(minPrice, prices.get(i));
            maxPro = Math.max(maxPro, prices.get(i) - minPrice);
            System.out.print(minPrice + " " + maxPro);
            System.out.println();
        }
        return maxPro;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println("1st: " + maxProfit(arr));
        arr.clear();
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        System.out.println("2nd: " + maxProfit(arr));
        arr.clear();
        arr.add(17);
        arr.add(20);
        arr.add(11);
        arr.add(9);
        arr.add(12);
        arr.add(6);
        System.out.println("3rd: " + maxProfit(arr));
        arr.clear();
        arr.add(98);
        arr.add(101);
        arr.add(66);
        arr.add(72);
        System.out.println("4th: " + maxProfit(arr));
        arr.clear();
    }
}
