package src.Leetcode;

public class MinimumDeletionToBalancedString {

    public static int minimumDeletions(String s) {
        int n = s.length();
        int[] finds = new int[n + 1];
        int b = 0;
        for (int i = 1; i <= n; i++) {
            if (s.charAt(i - 1) == 'b') {
                finds[i] = finds[i - 1];
                ++b;
            } else {
                finds[i] = Math.min(finds[i - 1] + 1, b);
            }
        }
        return finds[n];
    }

    public static void main(String[] args) {
        String s = "bbaaaaabb";
        System.out.println(minimumDeletions(s));
    }
}
