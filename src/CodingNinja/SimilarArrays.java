package src.CodingNinja;

import java.util.ArrayList;
import java.util.HashSet;

public class SimilarArrays {
    public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m){
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        HashSet<Integer> combinedSet = new HashSet<>();
        int common =0;
        for(int i: arr1){
            hashSet1.add(i);
            combinedSet.add(i);
        }
        for(int i: arr2){
            hashSet2.add(i);
            if(!combinedSet.contains(i))
                combinedSet.add(i);
        }
        for(int i : hashSet1){
            if(hashSet2.contains(i))
                common++;
        }
        list.add(common);
        list.add(combinedSet.size());
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr2.add(2);
        arr2.add(4);
        arr2.add(6);
        arr2.add(8);
        ArrayList<Integer> list = findSimilarity(arr1, arr2, arr1.size(), arr2.size());
        System.out.println(list);
    }
}
