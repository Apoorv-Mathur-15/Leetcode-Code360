package src.Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HasGroupsSizeX {

    public static boolean hasGroupsSizeX(int[] deck) {
        Arrays.sort(deck);
        if(deck.length < 2) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : deck)
            map.put(i, map.getOrDefault(i, 0) + 1);
        int gcd = 0;

        for(int freq : map.values()) {
            gcd = gcd(gcd, freq);

            if(gcd == 1)
                return false;
        }
        return gcd >= 2;
    }

    private static int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(hasGroupsSizeX(new int[]{1,1,2,2,3,3,4,4}));
        System.out.println(hasGroupsSizeX(new int[]{1,1,1,2,2,2,3,3}));
    }
}
