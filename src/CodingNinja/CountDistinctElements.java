package src.CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElements {
    public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.size();
        for(int i=0; i<n-k+1; i++) {
            System.out.println("Outer for loop for i: "+i);
            HashSet set = new HashSet<>();
            for(int j=i; j<i+k; j++) {
                System.out.println("Inner for loop for i & j: "+i+" "+j);
                set.add(arr.get(j));
            }
            list.add(set.size());
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,1,3,4,2,3));
        ArrayList<Integer> list = countDistinctElements(arr, 4);
        System.out.println("Result:");
        for(int i : list)
            System.out.print(i+" ");
    }
}
