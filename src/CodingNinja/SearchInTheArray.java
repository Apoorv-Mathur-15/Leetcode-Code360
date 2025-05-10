package src.CodingNinja;

import java.util.ArrayList;

public class SearchInTheArray {
    public static ArrayList<Integer> searchInTheArray(ArrayList<Integer> arr, ArrayList<Integer> queries, int n, int q){
        ArrayList<Integer> list = new ArrayList<>();
        for(int query : queries){
            int sum = 0;
            for(int i : arr){
                if( i <= query)
                    sum += i;
            }
            list.add(sum);
        }
        return list;
    }
}
