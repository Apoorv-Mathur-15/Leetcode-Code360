package CodingNinja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperiorElements {
    public static List<Integer> superiorElements(int[] a) {
        int n = a.length;
        List<Integer> ans = new ArrayList<>();
        int max = a[n - 1];
        ans.add(max);
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > max) {
                ans.add(a[i]);
                max = a[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2};
        List<Integer> ans = superiorElements(a);
        Collections.sort(ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
