package src.Leetcode;

public class EliminationGame {
    public static int lastRemaining(int n) {
        return n == 1 ? 1 : 2 * (n / 2 - lastRemaining(n / 2) + 1);
    }

    public static void main(String[] args) {
        System.out.println(lastRemaining(7));
    }
}
