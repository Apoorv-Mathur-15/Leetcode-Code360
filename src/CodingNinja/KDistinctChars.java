package src.CodingNinja;

import java.util.HashMap;

public class KDistinctChars {
    public static int kDistinctChars(int k, String str){
        if(k == 0)
            return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, max = 0;

        for(int right = 0; right < str.length(); right++){
            map.put(str.charAt(right), map.getOrDefault(str.charAt(right), 0) + 1);
            while (map.size() > k){
                map.put(str.charAt(left), map.get(str.charAt(left) - 1));
                if(map.get(str.charAt(left)) == 0)
                    map.remove(str.charAt(left));
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(kDistinctChars(2, "aabbababsklans"));
    }
}
