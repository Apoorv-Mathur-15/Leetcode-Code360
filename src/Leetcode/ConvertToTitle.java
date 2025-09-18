package src.Leetcode;

public class ConvertToTitle {
    public static String convertToTitle(int col) {
        StringBuilder sb = new StringBuilder();
        while (col > 0) {
            int temp = (col - 1) % 26;
            sb.insert(0,(char)('A' + temp));
            col = (col - 1) / 26;
        }
        return sb.toString();
    }

    static void main(String[] args) {
        System.out.println(convertToTitle(25));
        System.out.println(convertToTitle(255716));
    }
}
