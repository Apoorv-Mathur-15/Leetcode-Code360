package src.Leetcode;

public class HappyNumber {

    public static boolean isHappy(int n) {
        boolean happy;
        int a = n, rem, sum = 0;
        if (n == 1 | n == 7)
            happy = true;
        else if (a > 1 && a < 10)
            happy = false;
        else {
            while (a != 0) {
                rem = a % 10;
                sum = sum + rem * rem;
                a = a / 10;
            }
            if (sum != 1)
                happy = isHappy(sum);
            else
                happy = true;
        }
        return happy;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println("Is " + n + " a happy number?: " + isHappy(n));
    }
}
