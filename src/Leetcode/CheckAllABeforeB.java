package src.Leetcode;

public class CheckAllABeforeB {
    public static boolean checkString(String s) {
        if (!s.contains("b"))
            return true;
        return !(s.lastIndexOf("a") > s.indexOf("b"));

    }

    public static void main(String[] args) {
        String s = "aaaabbb";
        System.out.println(checkString(s));
    }
}
