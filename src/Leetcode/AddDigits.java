package src.Leetcode;

public class AddDigits {
    public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        }
        return num % 9;
    }


    public static void main(String[] args) {
        System.out.println(addDigits(77));
    }
}
