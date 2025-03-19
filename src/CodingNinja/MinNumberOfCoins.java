package src.CodingNinja;

import java.util.ArrayList;
import java.util.List;

public class MinNumberOfCoins {
    public static List<Integer> MinimumCoins(int n){
        int[] coins = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        List<Integer> list = new ArrayList<>();
        for(int coin : coins){
            while( n >= coin){
                System.out.println("n+coin: "+n+" "+coin);
                list.add(coin);
                n -= coin;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        //List<Integer> list = MinimumCoins(20001536);
        List<Integer> list = MinimumCoins(4);
        for(int i : list)
            System.out.print(i+" ");
    }
}
