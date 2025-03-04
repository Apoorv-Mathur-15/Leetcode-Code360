package src.CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        Set<Integer> set = new HashSet<>();
        for (int a : arr) {
            if (set.contains(a))
                return a;
            set.add(a);
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,1,2));
        System.out.println(findDuplicate(arr,3));
    }
}
