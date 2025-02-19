package src.CodingNinja;

public class ReverseStringInWords {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                i--;
                continue;
            }
            int start = s.lastIndexOf(' ', i);
            sb.append(' ');
            sb.append(s, start + 1, i + 1);
            i = start - 1;
        }
        if (sb.length() > 0)
            sb.deleteCharAt(0);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Apoorv Mathur";
        System.out.println(reverseWords(s));
    }
}
