package src.Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;

public class SingleNumberIII {
    public static int[] singleNumberI(int[] nums) {
        Queue<Integer> q = new PriorityQueue<>();
        for (int num : nums) {
            System.out.println("Num: "+num);
            if(q.contains(num))
                q.remove(num);
            else
                q.add(num);
            System.out.println(q);
        }
        return q.stream().mapToInt(x->x).toArray();
    }
    public static int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num))
                set.remove(num);
            else
                set.add(num);
        }
        return set.stream().mapToInt(x->x).toArray();
    }

    static void main() {
        System.out.println(Arrays.toString(singleNumber(new int[]{1,2,1,3,2,5})));
    }
}
