package Leetcode;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int num = 1, carry = 0, sum = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1)
                sum = digits[i] + carry + num;
            else
                sum = digits[i] + carry;
            carry = sum / 10;
            digits[i] = sum % 10;
        }
        if (carry != 0) {
            int[] ans = new int[digits.length + 1];
            ans[0] = carry;
            System.arraycopy(digits, 0, ans, 1, ans.length - 1);
            return ans;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3};
        int[] num2 = {4, 3, 2, 1};
        int[] num3 = {0};
        int[] num4 = {9};
        int[] ans1 = plusOne(num1);
        int[] ans2 = plusOne(num2);
        int[] ans3 = plusOne(num3);
        int[] ans4 = plusOne(num4);
        System.out.println("Array 1: ");
        for (int i : ans1)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Array 2: ");
        for (int i : ans2)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Array 3: ");
        for (int i : ans3)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Array 4: ");
        for (int i : ans4)
            System.out.print(i + " ");
        System.out.println();

    }
}
