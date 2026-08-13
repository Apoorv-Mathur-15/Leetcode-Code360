package src.Leetcode;

import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        int len = s.split(" ").length;
        if(pattern.length()!=len)
            return false;
        String[] split = s.split(" ");
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> map1 = new HashMap<>();
        for(int i=0;i<len;i++){
            String key = String.valueOf(pattern.charAt(i));
            if(map.containsKey(key)){
                if(!map.get(key).equals(split[i])){
                    return false;
                }
            }
            else {
                map.put(key,split[i]);
            }
            if(map1.containsKey(split[i])){
                if(!map1.get(split[i]).equals(key)){
                    return false;
                }
            }
            else {
                map1.put(split[i],key);
            }
        }

        return true;
    }

    static void main() {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat dof"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat fish"));
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }
}
