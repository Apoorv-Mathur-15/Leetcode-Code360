package src.Leetcode;

import java.util.StringJoiner;

public class NumberToWords {

    private static String[] ones = {"One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine "};

    private static String[] teens = {"Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};

    private static String[] twenties = {"Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};

    public static String numberToWords(int num) {

        if (num == 0)
            return "Zero";
        StringJoiner joiner = new StringJoiner("");
        processThreeDigits(joiner, num / 1_000_000_000, "Billion ");
        processThreeDigits(joiner, num / 1_000_000, "Million ");
        processThreeDigits(joiner, num / 1_000, "Thousand ");
        processThreeDigits(joiner, num, null);
        return joiner.toString().trim();
    }

    private static void processThreeDigits(StringJoiner joiner, int input, String name) {
        int threeDigits = input % 1000;
        if(threeDigits > 0){
            if(threeDigits / 100 > 0) {
                joiner.add(ones[threeDigits / 100 - 1]);
                joiner.add("Hundred ");
            }
            if(threeDigits % 100 >= 20) {
                joiner.add(twenties[(threeDigits % 100) / 10 - 2]);
                if(threeDigits % 10 > 0)
                    joiner.add(ones[threeDigits % 10 - 1]);
            } else if (threeDigits % 100 >= 10 && threeDigits % 100 < 20) {
                joiner.add(teens[threeDigits % 10]);
            } else if (threeDigits % 100 > 0 && threeDigits % 100 < 10) {
                joiner.add(ones[threeDigits % 10 - 1]);
            }
            if (name != null) {
                joiner.add(name);
            }
        }
    }

    static void main() {
        System.out.println(numberToWords(20));
        System.out.println(numberToWords(2015));
    }
}
