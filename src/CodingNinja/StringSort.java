package src.CodingNinja;

import java.util.Arrays;

public class StringSort {
    public static String stringSort(String s) {
        char[] cArray = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.sort(cArray);
        for(char c : cArray)
            stringBuilder.append(c);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringSort("kbfhh"));
    }
}
