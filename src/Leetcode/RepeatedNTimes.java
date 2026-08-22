package src.Leetcode;

import java.util.HashSet;

public class RepeatedNTimes {
    public static int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(repeatedNTimes(new int[]{1,2,3,3}));
        System.out.println(repeatedNTimes(new int[]{2,1,2,5,3,2}));
        System.out.println(repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }
}
