package src.Leetcode;

public class CountAndSay {
    public static String countAndSay(int n){
        if (n == 1) {
            return "1";
        }
        StringBuilder res = new StringBuilder();
        String previous = countAndSay(n - 1);
        int count = 1;
        for (int i = 1; i < previous.length(); i++) {
            if (previous.charAt(i) == previous.charAt(i - 1)) {
                count++;
            } else {
                res.append(count).append(previous.charAt(i - 1));
                count = 1;
            }
        }
        res.append(count).append(previous.charAt(previous.length() - 1));
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));
    }
}
