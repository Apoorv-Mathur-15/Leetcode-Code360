package src.CodingNinja;

public class SumOrProduct {
    public static long sumOrProduct(int n, int q) {
        long result= (q == 1) ? 0 : 1;
        final int MOD = 1_000_000_007;
        // Write your code here
        for(int i=1; i<=n; i++){
            if(q == 1)
                result += i;
            else if(q == 2)
                result = (result * i) % MOD;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumOrProduct(5, 2));
        System.out.println(sumOrProduct(5, 1));
    }
}
