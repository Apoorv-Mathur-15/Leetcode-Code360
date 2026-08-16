package src.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonFromSentences {
    public static String[] uncommonFromSentences(String s1, String s2) {
        List<String> list = new ArrayList<String>();

        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();

        for(String s: s1.toLowerCase().split(" ")) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }

        for(String s: s2.toLowerCase().split(" ")) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }
        for(Map.Entry<String, Integer> entry: map1.entrySet()) {
            if(entry.getValue() == 1 && !map2.containsKey(entry.getKey()))
                list.add(entry.getKey());
        }

        for(Map.Entry<String, Integer> entry: map2.entrySet()) {
            if(entry.getValue() == 1 && !map1.containsKey(entry.getKey()))
                list.add(entry.getKey());
        }

        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] result = uncommonFromSentences("this apple is sweet", "this apple is sour");
        for(String s: result) {
            System.out.print(s+" ");
        }
        System.out.println();
        result = uncommonFromSentences("apple apple cow", "banana");
        for(String s: result) {
            System.out.print(s+" ");
        }
    }
}
