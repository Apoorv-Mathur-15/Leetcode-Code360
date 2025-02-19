package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SumDigitsStringAfterConvert {
    public static int getLucky(String s, int k) {
        List<Integer> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list.add(c - 'a' + 1);
        }
        int sum = 0;
        for (int i : list) {
            System.out.println(i);
            if (i >= 10)
                sum += i / 10;
            sum += i % 10;
            System.out.println(sum);
        }
        while (k-- > 1) {
            int newSum = 0;
            while (sum != 0) {
                newSum += sum % 10;
                sum = sum / 10;
            }
            sum = newSum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getLucky("iiii", 1));
    }
}
