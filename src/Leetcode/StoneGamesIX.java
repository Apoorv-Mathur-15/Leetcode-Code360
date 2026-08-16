package src.Leetcode;

public class StoneGamesIX {
    public static boolean stoneGamesIX(int[] stones) {
        int zero = 0, one = 0, two = 0;
        for (int i : stones) {
            if( i % 3 == 0)
                zero++;
            if( i % 3 == 1)
                one++;
            if( i % 3 == 2)
                two++;
        }
        if(zero % 2 == 0)
            return one >= 1 && two >= 1;

        return Math.abs(one - two) > 2;
    }
    public static void main(String[] args) {
        System.out.println(stoneGamesIX(new int[]{2,1}));
        System.out.println(stoneGamesIX(new int[]{2}));
        System.out.println(stoneGamesIX(new int[]{1,2,3,4,5}));
    }
}
