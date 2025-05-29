package src.Leetcode;

public class ValidSudoku {

    private static boolean checkRow(char[][] board, int row, char n){
        int count = 0;
        for(int i = 0; i < 9; i++){
            if(board[row][i] == n)
                count++;
        }
        return count == 0;
    }

    private static boolean checkCol(char[][] board, int col, char n){
        int count = 0;
        for(int i = 0; i < 9; i++){
            if(board[i][col] == n)
                count++;
        }
        return count == 0;
    }

    private static boolean checkBox(char[][] board, int row, int col, char n){
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        int count = 0;

        for(int i = startRow; i < startRow + 3; i++){
            for(int j = startCol; j < startCol + 3; j++){
                if(board[i][j] == n)
                    count++;
            }
        }
        return count == 0;
    }

    public static boolean isValidSudoku(char[][] board){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    char current = board[i][j];

                    // Temporarily remove the digit to avoid double-counting itself
                    board[i][j] = '.';

                    if(!checkRow(board, i, current) || !checkCol(board, j, current) || !checkBox(board, i, j, current))
                        return false;

                    // Restore the digit
                    board[i][j] = current;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        char[][] board1 = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(board));  // Should return true for this valid board
        System.out.println(isValidSudoku(board1));  // Should return true for this valid board
    }
}
