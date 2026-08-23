package src.Leetcode;

public class SumGame {
    public static boolean sumGame(String num) {
        int len  = num.length() / 2;

        int firstSum = 0, secondSum = 0, firstGuess = 0, secondGuess = 0;
        for(int i = 0; i < len; i++){
            char a = num.charAt(i);
            char b = num.charAt(len + i);

            if( a == '?' )
                firstGuess++;
            else
                firstSum += a - '0';
            if( b == '?' )
                secondGuess++;
            else
                secondSum += b - '0';
        }

        int diff = 2 * (firstSum - secondSum) + 9 * (firstGuess - secondGuess);

        return diff != 0;
    }
    public static void main(String[] args) {
        System.out.println(sumGame("112346"));
        System.out.println(sumGame("11?346"));
        System.out.println(sumGame("18???6"));
        System.out.println(sumGame("1????1"));
    }
}
