package src.Leetcode;

public class RotatingTheBox {
    public static char[][] rotateTheBox(char[][] boxGrid) {
        int originalRows = boxGrid.length;
        int originalCols = boxGrid[0].length;
        char[][] result = new char[originalCols][originalRows];
        for (int i = 0; i < originalRows; i++) {
            int j = originalCols - 1;
            int index = originalCols - 1;
            while (j >= 0){
                if(boxGrid[i][j] == '#'){
                    result[j--][originalRows - i - 1] = '.';
                    result[index--][originalRows - i - 1] = '#';
                }
                else {
                    char c = boxGrid[i][j];
                    result[j--][originalRows - i - 1] = c;
                    if(c == '*')
                        index = j;
                }
            }
        }
        return result;
    }
}
