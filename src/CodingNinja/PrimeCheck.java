package src.CodingNinja;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeCheck {
    static final int MAX = 10000001; // 10^7 + 1 for safety
    static boolean[] isPrime = new boolean[MAX];
    static int[] primePrefix = new int[MAX];

    // Build sieve and prime prefix counts
    static void preprocess() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i < MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Create prefix sum of primes
        for (int i = 1; i < MAX; i++) {
            primePrefix[i] = primePrefix[i - 1] + (isPrime[i] ? 1 : 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        preprocess();

        int Q = sc.nextInt();
        while (Q-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int K = sc.nextInt();

            int left = A, right = B, ans = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                int primeCount = primePrefix[mid] - primePrefix[A - 1];

                if (primeCount >= K) {
                    ans = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
