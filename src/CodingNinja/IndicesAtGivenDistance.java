package src.CodingNinja;

import java.util.ArrayList;
import java.util.TreeSet;

public class IndicesAtGivenDistance {
    public static ArrayList<Integer> indicesAtGivenDistance(ArrayList<Integer> nums , int n , int k , int m){
        TreeSet<Integer> window = new TreeSet<>();
        for(int i=0; i<n; i++){
            Integer floor = window.floor(nums.get(i) + m);
            Integer ceil = window.ceiling(nums.get(i) - m);
            if((floor != null && Math.abs(floor - nums.get(i)) <= m) || (ceil != null && Math.abs(ceil - nums.get(i)) <= m)){
                for(int j = Math.max(0, i - k); j<i; j++){
                    if(Math.abs(nums.get(i) - nums.get(j)) <= m){
                        ArrayList result = new ArrayList<>();
                        result.add(i);
                        result.add(j);
                        return result;
                    }
                }
            }
            window.add(nums.get(i));
            if(i >= k)
                window.remove(nums.get(i - k));
        }
        return new ArrayList<>();
    }
}
