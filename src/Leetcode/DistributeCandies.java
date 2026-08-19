package src.Leetcode;

import java.util.HashSet;

public class DistributeCandies {
    public static int distributeCandies(int[] candyType){
        int n = candyType.length / 2;
        HashSet<Integer> set = new HashSet<>();
        for(int i : candyType){
            if(!(set.contains(i)))
                set.add(i);
        }

        return set.size() > n ? n : set.size();
    }

    static void main() {
        System.out.println(distributeCandies(new int[]{1,1,2,2,3,3}));
        System.out.println(distributeCandies(new int[]{1,1,2,3}));
        System.out.println(distributeCandies(new int[]{1,1,1,1,1}));
    }
}
