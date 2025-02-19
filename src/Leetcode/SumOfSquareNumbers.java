package src.Leetcode;

public class SumOfSquareNumbers {

    public static boolean judgeSquareSum(int n) {
        long low = 0, high = (long) Math.sqrt(n);
        System.out.println("l= " + low + " & h= " + high);
        while (low <= high) {
            long sum = low * low + high * high;
            if (sum == n)
                return true;
            else if (sum < n)
                low++;
            else
                high--;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(2));
    }
}
