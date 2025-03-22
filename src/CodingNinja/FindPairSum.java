package src.CodingNinja;

import java.util.HashSet;

public class FindPairSum {
    public static boolean findPairSum(int[] arr, int target){
        HashSet set = new HashSet();
        for(int i : arr){
            if(set.contains( target - i))
                return true;
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(findPairSum(new int[]{5,6,7,4,3,2,1}, 10));
        System.out.println(findPairSum(new int[]{5,7,9,1,3}, 4));
    }
}
