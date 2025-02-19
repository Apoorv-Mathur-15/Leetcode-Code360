package src.CodingNinja;

public class checkPrime {
    public static boolean isPrime(int n) {
        boolean status = false;
        int count = 0;
        for (int i = 1; i < n / 2; i++) {
            if (count > 1)
                return false;
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 1)
            return true;
        return status;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5000001));
    }
}
