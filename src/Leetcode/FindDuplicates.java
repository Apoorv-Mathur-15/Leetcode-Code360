package src.Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) {
            if(set.contains(i)) {
                list.add(i);
            }
            else
                set.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[]{1, 2, 3, 1, 3, 4, 5, 7, 8}));
        System.out.println(findDuplicates(new int[]{1, 1, 2}));
        System.out.println(findDuplicates(new int[]{1}));
    }
}
