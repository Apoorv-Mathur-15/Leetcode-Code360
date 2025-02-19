package src.CodingNinja;

public class LargestOddNumberString {
    public static String largestOddNumber(String s) {
        String st = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c % 2 == 1) {
                st = s.substring(0, i + 1);
                break;
            }
        }
        return st;

    }

    public static void main(String[] args) {
        String s = "31514651";
        String s1 = "31514648";
        System.out.println(largestOddNumber(s));
        System.out.println(largestOddNumber(s1));
    }
}
