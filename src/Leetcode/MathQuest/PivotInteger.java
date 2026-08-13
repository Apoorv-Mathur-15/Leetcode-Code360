package src.Leetcode.MathQuest;

public class PivotInteger {
    public static int pivotInteger(int n) {
        if(n == 1)
            return 1;
        double x = Math.sqrt(n*(n+1)/2);
        System.out.println("x: "+x);
        if(x == (int) x )
            return (int) x;
        return -1;
    }

    public static void main() {
        System.out.println(pivotInteger(8));
    }
}
