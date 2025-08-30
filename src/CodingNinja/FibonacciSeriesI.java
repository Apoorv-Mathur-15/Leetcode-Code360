package src.CodingNinja;

public class FibonacciSeriesI {

    private static int[] fibCache = new int[100]; // Cache to store previously calculated Fibonacci numbers

    public static int[] generateFibonacciNumbers(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = fibonacci(i);
        }
        return arr;
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (fibCache[n] != 0) { // Check if the Fibonacci number is already calculated and stored in the cache
            return fibCache[n];
        }

        int result = fibonacci(n - 1) + fibonacci(n - 2);
        fibCache[n] = result; // Store the calculated Fibonacci number in the cache
        return result;
    }

    public static void main(String[] args) {
        int[] arr = generateFibonacciNumbers(10);
        for(int i : arr)
            System.out.print(i+" ");
    }
}
