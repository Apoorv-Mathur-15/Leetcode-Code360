package src.Leetcode;

public class CalculateDigitSumOfString {

    public static String digitSum(String s, int k) {
        while (s.length() > k) {
            int n = s.length();
            StringBuilder st = new StringBuilder();
            for (int i = 0; i < n; i += k) {
                int x = 0;
                for (int j = i; j < Math.min(i + k, n); ++j) {
                    x += s.charAt(j) - '0';
                }
                st.append(x);
            }
            s = st.toString();
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(digitSum("11111222223", 3));
    }
}
