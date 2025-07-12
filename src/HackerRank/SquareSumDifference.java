package src.HackerRank;

public class SquareSumDifference {
    private static long difference(int n){
        long sum1 = (long) n * (n + 1) / 2;
        long sum2 = n * (n + 1) * (2L *n + 1) / 6;
        System.out.println("Sum1: "+sum1);
        System.out.println("Sum2: "+sum2);
        return Math.abs(sum1 * sum1 - sum2);
    }
    public static void main(String[] args) {
        System.out.println(difference(10));
        System.out.println(difference(3));
    }
}
