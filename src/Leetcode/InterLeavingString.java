package src.Leetcode;

public class InterLeavingString {

    public static boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length())
            return false;

        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        dp[0][0] = true;
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {

                if (i == 0 && j == 0) {
                    continue;
                }

                int k = i + j - 1;

                // Take character from s1
                if (i > 0 &&
                        dp[i - 1][j] &&
                        s1.charAt(i - 1) == s3.charAt(k)) {

                    dp[i][j] = true;
                }

                // Take character from s2
                if (j > 0 &&
                        dp[i][j - 1] &&
                        s2.charAt(j - 1) == s3.charAt(k)) {

                    dp[i][j] = true;
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        System.out.println(isInterleave("", "", ""));
        System.out.println(isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        System.out.println(isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }
}
