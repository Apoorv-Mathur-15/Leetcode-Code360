import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    private static char currentPlayer = 'X';

    private static void printBoard() {
        System.out.println(" " + board[0][0] + " | " + " " + board[0][1] + " | " + " " + board[0][2]);
        System.out.println("-----------");
        System.out.println(" " + board[1][0] + " | " + " " + board[1][1] + " | " + " " + board[1][2]);
        System.out.println("-----------");
        System.out.println(" " + board[2][0] + " | " + " " + board[2][1] + " | " + " " + board[2][2]);
        System.out.println("-----------");
    }

    private static void playerMove(Scanner sc) {
        int row, col;
        while (true) {
            System.out.println("Player " + currentPlayer + ", enter row(0,1,2) and column(0,1,2): ");
            row = sc.nextInt();
            col = sc.nextInt();
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("Invalid move, try again...");
            }
        }
    }

    private static boolean checkForWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer)
                return true;
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)
                return true;
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[1][2] == currentPlayer)
            return true;
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)
            return true;
        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            printBoard();
            playerMove(sc);
            if (checkForWin()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins...");
                break;
            }
            if (isBoardFull()) {
                printBoard();
                System.out.println("Its a draw :(");
                break;
            }
            switchPlayer();
        }
    }
}
