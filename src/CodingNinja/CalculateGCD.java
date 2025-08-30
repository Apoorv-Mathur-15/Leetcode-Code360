package src.CodingNinja;

import java.util.HashSet;

public class CalculateGCD {
    public static int calcGCD(int n, int m) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=1; i<= Math.max(n,m); i++) {
            if(i <= n && n % i == 0)
                set1.add(i);
            if(i <= m && m % i == 0)
                set2.add(i);
        }
        int max = 1;
        for(int i : set1){
            if(set2.contains(i))
                max = Math.max(max, i);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(calcGCD(63,63));
    }
}
