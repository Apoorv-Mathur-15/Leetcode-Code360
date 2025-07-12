package src.HackerRank;

public class SumOfEvenFibonacci {
    private static long sumFibonnaci(long n){
        long first = 1, second = 2;
        long sum = 0;
        while(first < n){
            System.out.println("first, second & sum: "+first+" "+second+" "+sum);
            long next = first + second;
            sum += (first % 2 == 0) ? first : 0;
            first = second;
            second = next;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumFibonnaci(10));
        System.out.println(sumFibonnaci(100));
        System.out.println(sumFibonnaci(1000));
    }
}
