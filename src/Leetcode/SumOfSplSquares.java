package src.Leetcode;

public class SumOfSplSquares {

    public static int sumOfSplSquares(int[] num) {
        int sum = 0, n = num.length;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                System.out.println("i= " + i + " & value= " + num[i]);
                sum += num[i] * num[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] num = new int[]{2, 7, 1, 19, 18, 3};
        System.out.println(sumOfSplSquares(num));
    }
}
