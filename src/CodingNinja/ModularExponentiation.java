package src.CodingNinja;

public class ModularExponentiation {
    public static long modularExponentiation(long x, long n, long m){
        //System.out.println(Math.pow(x,n));
        long result = 1;
        x = x % m;  // Take x % m to handle large bases
        while (n > 0) {
            if (n % 2 == 1) {  // If n is odd
                result = (result * x) % m;
            }
            x = (x * x) % m;  // Square the base, and take modulo
            n = n / 2;  // Divide the exponent by 2
        }
        return result;
    }

    public static void main(String[] args) {
        //System.out.println(modularExponentiation(3,1,2));
        //System.out.println(modularExponentiation(4,3,10));
        System.out.println(modularExponentiation(10000000,2,10000001));
        System.out.println(modularExponentiation(10000000,10,10000005));
        System.out.println(modularExponentiation(10000000,10,10));
    }
}
