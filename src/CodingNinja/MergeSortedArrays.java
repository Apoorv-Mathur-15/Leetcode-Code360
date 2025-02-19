package src.CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MergeSortedArrays {

    public static List<Integer> sortedArray(int[] a, int[] b) {
        // Write your code here
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i]))
                continue;
            else
                set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if (set.contains(b[i]))
                continue;
            else
                set.add(b[i]);
        }
        int[] final_array = new int[set.size()];
        int j = 0;
        for (int i : set) {
            final_array[j] = i;
            j++;
        }
        Arrays.sort(final_array);
        List<Integer> list = new ArrayList<>();
        for (int i : final_array)
            list.add(i);
        return list;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 7};
        int[] b = {2, 5, 7, 9, 12};
        List<Integer> list = sortedArray(a, b);
        for (int i : list)
            System.out.print(i + " ");
    }
}
