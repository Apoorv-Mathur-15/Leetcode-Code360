package src.Leetcode;

public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(search(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }
    private static boolean search(char[][] board, String word, int i, int j, int index) {
        if(index == word.length())
            return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index))
            return false;
        char temp = board[i][j];
        board[i][j] = '#';
        boolean found = search(board, word, i+1, j, index+1) || search(board, word, i - 1, j, index + 1) ||
                search(board, word, i, j + 1, index + 1) || search(board, word, i, j - 1, index + 1);
        board[i][j] = temp;
        return found;
    }

    static void main(String[] args) {
        char[][] board = new char[][]{
                {'C','A','A'},
                {'A','A','A'},
                {'B','C','D'}};
        System.out.println(exist(board, "AAB"));
    }
}
