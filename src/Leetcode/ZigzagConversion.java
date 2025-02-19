package Leetcode;

public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows)
            return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++)
            rows[i] = new StringBuilder();
        int row = 0;
        boolean down = false;
        for (char c : s.toCharArray()) {
            rows[row].append(c);
            if (row == 0 || row == numRows - 1)
                down = !down;
            row += down ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder stringBuilder : rows)
            result.append(stringBuilder);
        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "PAYPALISHIRING", s2 = "PAYPALISHIRING", s3 = "A";
        int n1 = 3, n2 = 4, n3 = 1;
        System.out.println(convert(s1, n1));
        System.out.println(convert(s2, n2));
        System.out.println(convert(s3, n3));
    }
}
