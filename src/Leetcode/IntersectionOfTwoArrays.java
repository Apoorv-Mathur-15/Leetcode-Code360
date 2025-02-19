package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int x : nums1)
            set1.add(x);
        for (int x : nums2)
            set2.add(x);
        ArrayList<Integer> list = new ArrayList<>();
        for (int x : set1) {
            if (set2.contains(x)) {
                list.add(x);
            }
        }
        int result[] = new int[list.size()];
        int i = 0;
        for (int x : list) {
            result[i] = x;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
