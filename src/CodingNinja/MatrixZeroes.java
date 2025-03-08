package src.CodingNinja;

public class MatrixZeroes {
    public static void setZeroes(int matrix[][]){
        int col = matrix[0].length;
        int row = matrix.length;
        boolean isZero[][] = new boolean[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == 0)
                    isZero[i][j] = true;
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == 0 && isZero[i][j]){
                    matrix = setCol(matrix,j);
                    matrix = setRow(matrix,i);
                }
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] setCol(int matrix[][], int col){
        for(int i=0; i<matrix.length; i++){
            matrix[i][col] = 0;
        }
        return matrix;
    }
    public static int[][] setRow(int matrix[][], int row){
        for(int i=0; i<matrix[0].length; i++){
            matrix[row][i] = 0;
        }
        return matrix;
    }

    public static void setZeros(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,0,6},{7,8,9}};
        int matrix1[][] = {{1,2,3},{4,0,6},{7,8,9}};
        setZeroes(matrix);
        setZeros(matrix1);
    }
}
