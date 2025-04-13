package src.CodingNinja;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static char firstNonRepeatingCharacter(String s){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char c : s.toCharArray())
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        for(char c: s.toCharArray()){
            if(hashMap.get(c) == 1)
                return c;
        }
        return s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("aDcadhc"));
        System.out.println(firstNonRepeatingCharacter("AabBcC"));
        System.out.println(firstNonRepeatingCharacter("AAAbcdb"));
    }
}
