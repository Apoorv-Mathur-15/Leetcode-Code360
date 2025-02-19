package src.CodingNinja;

import java.util.HashSet;

public class GCD {
    public static void main(String[] args) {
        int num1 = 20, num2 = 30, count = 0, max = 0;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 1; i < Math.max(num1, num2); i++) {
            if ((num1 % i == 0) && num1 > i)
                set1.add(i);
            if ((num2 % i == 0) && num2 > i)
                set2.add(i);
        }
        int[] arr = new int[Math.max(set1.size(), set2.size())];
        for (int i : set1) {
            if (set2.contains(i)) {
                arr[count] = i;
                count++;
            }
        }
        for (int i : arr) {
            max = Math.max(max, i);
        }
        System.out.println(max);
    }
}
