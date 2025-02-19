package CodingNinja;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 10, orig = num, sum = 0;
        int length = String.valueOf(num).length();
        while (num != 0) {
            sum = (int) (sum + Math.pow((int) (num % 10), (int) length));
            num /= 10;
        }
        if (orig == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
