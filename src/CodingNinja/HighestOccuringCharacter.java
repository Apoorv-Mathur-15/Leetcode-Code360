package src.CodingNinja;

import java.util.HashMap;
import java.util.Map;

public class HighestOccuringCharacter {
    public static char highestOccuringChar(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        Map.Entry<Character, Integer> maxValueEntry = null;
        for(Map.Entry<Character, Integer> currentMapEntry : map.entrySet()){
            if(maxValueEntry == null || currentMapEntry.getValue() > maxValueEntry.getValue())
                maxValueEntry = currentMapEntry;
        }
        return maxValueEntry.getKey();
    }

    public static void main(String[] args) {
        String s = "abdefgbabfba";
        String s1 = "x";
        System.out.println(highestOccuringChar(s));
        System.out.println(highestOccuringChar(s1));
    }
}
