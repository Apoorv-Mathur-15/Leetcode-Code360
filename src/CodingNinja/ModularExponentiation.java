package src.CodingNinja;

public class ModularExponentiation {
    public static int modularExponentiation(int x, int n, int m){
        //System.out.println(Math.pow(x,n));
        int result = 1;
        x = x % m;
        while (n > 0){
            if(n % 2 == 1)
                result = (result * x) % m;
            x = (x * x) % m;
            n =  n / 2;
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
