package src.CodingNinja;

import java.util.HashSet;

public class CheckPermutation {
    public static boolean areAnagram(String str1, String str2){
        if( str1.length() != str2.length())
            return false;
        HashSet set1 = new HashSet<>();
        HashSet set2 = new HashSet<>();
        for(char c : str1.toCharArray())
            set1.add(c);
        for(char c : str2.toCharArray())
            set2.add(c);
        return set1.equals(set2);
    }

    public static void main(String[] args) {
        System.out.println(areAnagram("silent", "listen"));
        System.out.println(areAnagram("silent", "listens"));
    }
}
