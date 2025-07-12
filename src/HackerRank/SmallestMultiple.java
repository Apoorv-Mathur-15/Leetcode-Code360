package src.HackerRank;

public class SmallestMultiple {

    private static long smallestMultiple(int n) {
        long result = 1;
        for(int i=2; i<=n; i++){
            result = lcm(result, i);
        }
        return result;
    }
    private static long lcm(long a, int b) {
        return (a * b) / gcd((int)a, b);
    }

    private static long gcd(int a, int b) {
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(smallestMultiple(3));
        System.out.println(smallestMultiple(10));
    }
}
