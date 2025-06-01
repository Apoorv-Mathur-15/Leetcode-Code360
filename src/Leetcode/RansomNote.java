package src.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ransomMap = new HashMap<>();
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for(char c : ransomNote.toCharArray())
            ransomMap.put(c, ransomMap.getOrDefault(c, 0) + 1);
        for(char c : magazine.toCharArray())
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        for(Map.Entry<Character, Integer> entry : ransomMap.entrySet() ){
            //System.out.println("Key & Value: "+entry.getKey()+" "+entry.getValue());
            int value = entry.getValue();
            if(magazineMap.containsKey(entry.getKey())){
                //System.out.println(magazineMap.get(entry.getKey()));
                //System.out.println(value);
                if(value > magazineMap.get(entry.getKey()))
                    return false;
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("ab", "aacb"));
    }
}
