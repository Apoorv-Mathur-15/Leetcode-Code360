package src.Leetcode;

import java.util.HashMap;

public class FruitIntoBasket {

    public static int totalFruit(int[] fruits) {
        if (fruits == null || fruits.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < fruits.length; right++) {

            map.put(fruits[right],
                    map.getOrDefault(fruits[right], 0) + 1);

            // More than two fruit types
            while (map.size() > 2) {
                int fruit = fruits[left];

                map.put(fruit, map.get(fruit) - 1);

                if (map.get(fruit) == 0) {
                    map.remove(fruit);
                }

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(totalFruit(new int[]{1,1,2,2,3,3,3,3,4,4,4}));
        System.out.println(totalFruit(new int[]{1,1,2}));
        System.out.println(totalFruit(new int[]{1,1,2,0}));
        System.out.println(totalFruit(new int[]{1,1,2,3,2}));
        System.out.println(totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
    }
}
