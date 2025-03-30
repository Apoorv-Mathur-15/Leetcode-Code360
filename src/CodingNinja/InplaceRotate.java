package src.CodingNinja;

public class InplaceRotate {

    public static void inplaceRotate(int[][] mat, int n) {
        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap mat[i][j] and mat[j][i]
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Step 2: Reverse each column
        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                // Swap the elements in the column
                int temp = mat[start][i];
                mat[start][i] = mat[end][i];
                mat[end][i] = temp;
                start++;
                end--;
            }
        }
    }

    // Function to print the matrix
    public static void printMatrix(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example n x n matrix
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = mat.length;

        // Print original matrix
        System.out.println("Original Matrix:");
        printMatrix(mat, n);

        // Rotate matrix
        inplaceRotate(mat, n);

        // Print the rotated matrix
        System.out.println("Matrix after 90 degree anti-clockwise rotation:");
        printMatrix(mat, n);
    }
}
