package src.CodingNinja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextPermutation {

    public static void nextPermutation(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr)
            list.add(i);
        int n = list.size(), ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (list.get(i) < list.get(i + 1)) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            Collections.reverse(list);
        }
        for (int i = n - 1; i > ind; i--) {
            if (list.get(i) > list.get(ind)) {
                int temp = list.get(i);
                list.set(i, list.get(ind));
                list.set(ind, temp);
                break;
            }
        }
        List<Integer> subList = list.subList(ind + 1, n);
        Collections.reverse(subList);
        for (int i : list)
            System.out.println(i + " ");

    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 5};
        nextPermutation(arr);
    }
}
