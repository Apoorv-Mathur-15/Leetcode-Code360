package src.Leetcode;

public class SumOfTwoIntegers {
    public static int getSum(int a, int b) {
        return Math.addExact(a, b);
    }
    public static void main(String[] args) {
        System.out.println(getSum(1, 2));
        System.out.println(getSum(3, 5));
    }
}
