package src.CodingNinja;

public class DecompressTheString {
    public static String decompressTheString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            i++;
            StringBuilder countingString = new StringBuilder();
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                countingString.append(s.charAt(i));
                i++;
            }
            int counter = !countingString.isEmpty() ? Integer.parseInt(countingString.toString()) : 1;

            for (int j = 0; j < counter; j++) {
                stringBuilder.append(c);
            }
        }

        return reverseWords(stringBuilder.toString());
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        if(i == 0)
            return s;
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
        System.out.println();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(decompressTheString("seaside the to sent be to ne2ds army ten of team a"));
    }
}
