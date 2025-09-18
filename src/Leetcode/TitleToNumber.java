package src.Leetcode;

public class TitleToNumber {
    public static int titleToNumber(String col) {
        int result = 0;
        for (int i = 0; i < col.length(); i++) {
            result = result * 26 + (col.charAt(i) - 'A' + 1);
        }
        return result;
    }

    static void main(String[] args) {
        //System.out.println(convertToTitle(25));
        //System.out.println(convertToTitle(255716));
        System.out.println(titleToNumber("Y"));
        System.out.println(titleToNumber("NNGF"));
    }
}
