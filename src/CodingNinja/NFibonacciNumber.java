package src.CodingNinja;

public class NFibonacciNumber {
    static final int MOD = 1000000007;

    public static int fibonacciNumber(int n){
        int[][] result = matrixPower(new int[][]{{1, 1}, {1, 0}}, n - 2);
        return (result[0][0] + result[0][1]) % MOD;
    }

    private static int[][] matrixPower(int[][] base, int power){
        int[][] result = new int[][]{{1, 0}, {0, 1}};
        while (power > 0){
            if((power & 1) == 1){
                result = multiplyMatrices(result, base);
            }
            base = multiplyMatrices(base, base);
            power >>= 1;
        }
        return result;
    }

    private static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] res = new int[2][2];
        res[0][0] = (int)(((long)a[0][0] * b[0][0] + (long)a[0][1] * b[1][0]) % MOD);
        res[0][1] = (int)(((long)a[0][0] * b[0][1] + (long)a[0][1] * b[1][1]) % MOD);
        res[1][0] = (int)(((long)a[1][0] * b[0][0] + (long)a[1][1] * b[1][0]) % MOD);
        res[1][1] = (int)(((long)a[1][0] * b[0][1] + (long)a[1][1] * b[1][1]) % MOD);
        return res;
    }
}
