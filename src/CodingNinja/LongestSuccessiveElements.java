package src.CodingNinja;

import java.util.HashSet;
import java.util.Set;

public class LongestSuccessiveElements {
    public static int longestSuccessiveElements(int[] a) {
        if (a.length == 0)
            return 0;
        int longest = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : a)
            set.add(i);
        for (int i : set) {
            if (!set.contains(i - 1)) {
                int count = 1, x = i;
                while (set.contains(x + 1)) {
                    x++;
                    count++;
                }
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        //int[] a = {5,8,3,2,1,4};
        int[] a = {15, 6, 2, 1, 16, 4, 2, 29, 9, 12, 8, 5, 14, 21, 8, 12, 17, 16, 6, 26, 3};
        System.out.println(longestSuccessiveElements(a));
    }
}
