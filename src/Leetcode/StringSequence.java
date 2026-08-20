package src.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class StringSequence {
    public static List<String> stringSequence(String target){
        List<String> result = new ArrayList<>();
        char[] chars = target.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < chars.length; i++){
            sb.append('a');
            result = appendStrings(sb, chars[i] - 'a', result );
            //System.out.println("List @i: " + i +" : " + result);
        }
        return result;
    }
    private static List<String> appendStrings(StringBuilder sb, int n, List<String> list) {
        char c = (char) ('a' + n);
        for(char ch = 'a'; ch <= c; ch++){
            sb.setLength(sb.length() - 1);
            sb.append(ch);
            list.add(sb.toString());
        }
        return list;
    }

    public static void main() {
        System.out.println(stringSequence("abc"));
        System.out.println(stringSequence("he"));
    }
}
