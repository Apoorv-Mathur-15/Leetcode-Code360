package src.HackerRank;

public class NthPrimeNumber {
    private static int NthPrime(int n) {
        int count = 0, num = 1;
        while (count < n) {
            num++;
            //System.out.println("While loop for num: "+num+" "+count);
            if(isPrime(num)){
                count++;
                //System.out.println("Prime if block for count: "+count);
            }
        }
        return num;
    }
    private static boolean isPrime(int num){
        if (num <= 1) {
            //System.out.println("First if block in isPrime");
            return false;
        }
        if (num == 2) {
            //System.out.println("Second if block in isPrime");
            return true;
        }
        if (num % 2 == 0){
            //System.out.println("Third if block in isPrime");
            return false;
        }
        int counter = 0;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
            counter++;
        }
        //System.out.println("For loop accessed "+counter+" times for n: "+num);
        return true;
    }
    public static void main(String[] args) {
        int n = 1000;

        long startTime = System.nanoTime();

        int nthPrime = NthPrime(n);

        long endTime = System.nanoTime();

        long durationInNano = endTime - startTime;
        double durationInMillis = durationInNano / 1_000_000.0;

        System.out.println("The " + n + "th prime number is: " + nthPrime);
        System.out.println("Time taken: " + durationInMillis + " ms");
    }
}
