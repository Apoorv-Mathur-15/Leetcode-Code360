package src;

public class OneDArrayII {

    public static boolean canWin(int leap, int[] game) {
        return canWinFrom(0, leap, game);
    }

    private static boolean canWinFrom(int i, int leap, int[] game) {
        // Base conditions
        if (i >= game.length) return true;
        if (i < 0 || game[i] != 0) return false;

        game[i] = 1;

        // Try moves: leap forward, step forward, step back
        return canWinFrom(i + leap, leap, game)
                || canWinFrom(i + 1, leap, game)
                || canWinFrom(i - 1, leap, game);
    }

    public static void main(String[] args) {
        int[] game = new int[]{0,0,1,1,1,0};
        System.out.println(canWin(3, game)?"Yes":"No");
    }
}
