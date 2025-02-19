package Leetcode;

public class CountPrimes {
    public static int countPrimes(int n) {
        boolean[] isprime = new boolean[n];
        int count = 0;
        for (int i = 2; i * i <= n; i++) {
            if (!isprime[i]) {
                for (int j = i * 2; j < n; j += i) {
                    isprime[j] = true;
                }
            }
        }
        for (int i = 2; i < isprime.length; i++) {
            if (!isprime[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Number of prime numbers less than " + n + " are: " + countPrimes(n));
    }
}
