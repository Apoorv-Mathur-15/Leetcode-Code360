package src.CodingNinja;

import java.util.ArrayList;
import java.util.List;

public class PrintDivisors {
    public static List<Integer> printDivisors(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n % i == 0)
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = printDivisors(100);
        for(int i : list)
            System.out.print(i+" ");
    }
}
