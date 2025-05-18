package src.CodingNinja;

import java.util.Arrays;

public class TwoArraySum {
    public static int[] findArraySum(int[] a, int n, int[] b, int m) {
        int maxLength = Math.max(n, m) + 1;
        int[] result = new int[maxLength];
        int carry = 0, i = n - 1, j = m - 1, k = maxLength - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a[i--];
            if (j >= 0) sum += b[j--];
            result[k--] = sum % 10;
            carry = sum / 10;
        }

        // Skip leading zero if present
        if (result[0] == 0) {
            return Arrays.copyOfRange(result, 1, maxLength);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] sum = findArraySum(new int[]{4, 5, 1}, 3, new int[]{3, 4, 5}, 3);
        for (int i : sum)
            System.out.print(i);
    }
}
