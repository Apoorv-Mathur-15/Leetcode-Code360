package Leetcode;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int lastindex = s.lastIndexOf(' ') + 1;
        return s.length() - lastindex;
    }

    public static void main(String[] args) {

    }
}
