package src.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class KeyboardRow {
    public static String[] findWords(String[] words) {
        String row1Str = "qwertyuiopQWERTYUIOP";
        String row2Str = "asdfghjklASDFGHJKL";
        String row3Str = "zxcvbnmZXCVBNM";
        HashSet<Character> row1 = StringToHashSet(row1Str);
        HashSet<Character> row2 = StringToHashSet(row2Str);
        HashSet<Character> row3 = StringToHashSet(row3Str);
        List<String> list = new ArrayList<>();
        for(String word : words){
            if(checkRow(word,row1) || checkRow(word,row2) || checkRow(word,row3))
                list.add(word);
        }
        return list.toArray(new String[0]);
    }
    private static HashSet<Character> StringToHashSet(String array) {
        HashSet<Character> hashSet = new HashSet<>();
        for (char c : array.toCharArray()) {
            hashSet.add(c);
        }
        return hashSet;
    }
    private static boolean checkRow(String word, HashSet<Character> row) {
        for( char c : word.toCharArray()){
            if(!row.contains(c)){
                return false;
            }
            else
                continue;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[]{"Hello","Alaska","Dad","Peace"})));
    }
}
