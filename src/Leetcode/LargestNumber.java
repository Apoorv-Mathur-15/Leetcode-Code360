package src.Leetcode;

import java.util.Arrays;

public class LargestNumber {
    public static String largestNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();
        String[] s = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            s[i] = String.valueOf(nums[i]);
        Arrays.sort(s, (a,b)->(b + a).compareTo(a + b));
        for(String s1 : s)
            sb.append(s1);
        return String.valueOf(Long.parseLong(sb.toString()));
    }

    static void main() {
        System.out.println(largestNumber(new int[] {1,2,3,4,5}));
        System.out.println(largestNumber(new int[] {10, 2}));
        System.out.println(largestNumber(new int[] {2, 10}));
        System.out.println(largestNumber(new int[] {3,30,34,5,9}));
    }
}
