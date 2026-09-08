package src.Leetcode;

import java.util.TreeSet;

public class ContainsDuplicatesIII {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if( indexDiff <= 0 || valueDiff < 0 )
            return false;
        TreeSet<Long> set = new TreeSet<>();
        for(int i=0; i < nums.length; i++){
            long curr = nums[i];
            Long candidate = set.ceiling(curr - valueDiff);
            if(candidate != null && candidate <= curr +  valueDiff)
                return true;
            set.add(curr);
            if(i >= indexDiff)
                set.remove((long) nums[i-indexDiff]);
        }
        return false;
    }


    static void main() {
        System.out.println(containsNearbyAlmostDuplicate(new int[]{1, 2, 3, 1}, 3, 0));
        System.out.println(containsNearbyAlmostDuplicate(new int[]{1, 5, 9, 1, 5, 9}, 2, 3));
    }
}
