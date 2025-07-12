package src;

public class HighestPrimeFactor {
    private static long PrimeOrHighestPrimeFactor(long n){
        if(isPrimeNumber(n))
            return n;
        else {
            long maxP = -1;
            while(n % 2 == 0){
                maxP = 2;
                n /= 2;
            }
            for(long i=3; i*i <= n; i++){
                while( n % i == 0){
                    maxP = i;
                    n /= i;
                }
            }
            if(n > 2)
                maxP = n;
            return maxP;
        }
    }
    private static boolean isPrimeNumber(long n){
        if(n <= 1)
            return false;
        if(n <= 3)
            return true;
        if(n % 2 == 0 || n % 3 == 0)
            return false;
        for(long i = 5; i*i <= n; i+= 6){
            if(n % i == 0 || n % (i+2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(PrimeOrHighestPrimeFactor(10));
        System.out.println(PrimeOrHighestPrimeFactor(17));
    }
}
