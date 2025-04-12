package src.CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;

public class KthInteger {
    public static int kthInteger(int n, int k, int x, ArrayList<Integer> a){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i : a){
            if(i % x != 0)
                temp.add(i);
        }
        if(temp.isEmpty() || temp.size() < k)
            return -1;
        temp.sort(Integer::compare);
        return temp.get(k-1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10,3,27,81,9));
        System.out.println(kthInteger(5, 2, 3, a));
    }
}
