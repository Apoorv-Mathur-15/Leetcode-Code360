package src.Leetcode;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int m = 1000, c = 100, x = 10, i = 1;
        num = numeral(sb, num, m, ' ', ' ', 'M');
        num = numeral(sb, num, c, 'M', 'D', 'C');
        num = numeral(sb, num, x, 'C', 'L', 'X');
        num = numeral(sb, num, i, 'X', 'V', 'I');
        return sb.toString();
    }

    private static int numeral(StringBuilder sb, int num, int one, char cTen, char cFive, char cOne) {
        int div = num / one;
        switch (div) {
            case 9:
                sb.append(cOne);
                sb.append(cTen);
                break;
            case 8:
                sb.append(cFive);
                sb.append(cOne);
                sb.append(cOne);
                sb.append(cOne);
                break;
            case 7:
                sb.append(cFive);
                sb.append(cOne);
                sb.append(cOne);
                break;
            case 6:
                sb.append(cFive);
                sb.append(cOne);
                break;
            case 5:
                sb.append(cFive);
                break;
            case 4:
                sb.append(cOne);
                sb.append(cFive);
                break;
            case 3:
                sb.append(cOne);
                sb.append(cOne);
                sb.append(cOne);
                break;
            case 2:
                sb.append(cOne);
                sb.append(cOne);
                break;
            case 1:
                sb.append(cOne);
                break;
            default:
                break;
        }
        return num - (div * one);
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(100));
        System.out.println(intToRoman(1000));
        System.out.println(intToRoman(17816));
        System.out.println(intToRoman(952));
        System.out.println(intToRoman(456));
        System.out.println(intToRoman(555));
    }
}
