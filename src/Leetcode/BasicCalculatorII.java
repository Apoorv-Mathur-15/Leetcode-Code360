package src.Leetcode;

public class BasicCalculatorII {
    public static int calculate(String s) {
        int total = 0;
        int lastNumber = 0;
        int currentNumber = 0;
        char operation = '+';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            }
            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
                if (operation == '+') {
                    total += lastNumber;
                    lastNumber = currentNumber;
                }
                else if (operation == '-') {
                    total += lastNumber;
                    lastNumber = -currentNumber;
                }
                else if (operation == '*')
                    lastNumber = lastNumber * currentNumber;
                else if (operation == '/')
                    lastNumber = lastNumber / currentNumber;
                operation = ch;
                currentNumber = 0;
            }
        }
        return total + lastNumber;
    }
    public static void main(String[] args) {
        System.out.println(calculate("3+2*2"));   // 7
        System.out.println(calculate(" 3/2 "));  // 1
        System.out.println(calculate("3+5/2"));  // 5
        System.out.println(calculate("12+34"));  // 46
    }
}