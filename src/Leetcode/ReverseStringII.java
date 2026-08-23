package src.Leetcode;

public class ReverseStringII {
    public static String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i += 2 * k) {
            int end = Math.min(i + k, sb.length());
            temp(sb, i, end - 1);
        }

        return sb.toString();
    }

    private static void temp(StringBuilder sb, int left, int right) {
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);

            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
        System.out.println(reverseStr("abcd", 2));
        System.out.println(reverseStr("a", 1));
        System.out.println(reverseStr("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl", 39));
    }
}