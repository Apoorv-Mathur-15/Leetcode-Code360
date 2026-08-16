package src.Leetcode;

public class StoneGame {
    public static boolean stoneGame(int[] piles) {
        int low= 0, high = piles.length - 1, alice = 0, bob = 0;
        while (low < high) {
            alice += Math.max(piles[low], piles[high]);
            bob += Math.min(piles[low], piles[high]);
            low++;
            high--;
        }

        return alice > bob;
    }

    public static void main(String[] args) {
        System.out.println(stoneGame(new int[]{1,2,3,4}));
    }
}
