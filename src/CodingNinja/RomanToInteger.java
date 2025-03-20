package src.CodingNinja;

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int result = 0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for(int i = 0; i < s.length(); i++) {
            int s1 = map.get(s.charAt(i));
            if( i + 1 < s.length()){
                int s2 = map.get(s.charAt(i + 1));
                if(s1 >= s2)
                    result += s1;
                else {
                    result += s2 - s1;
                    i++;
                }
            }
            else
                result += s1;
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "C", s2 = "M", s3 = "DCCCXVI", s4 = "CMLII", s5 = "CDLVI", s6 = "DLV", s7 = "XII";
        System.out.println(romanToInt(s1));
        System.out.println(romanToInt(s2));
        System.out.println(romanToInt(s3));
        System.out.println(romanToInt(s4));
        System.out.println(romanToInt(s5));
        System.out.println(romanToInt(s6));
        System.out.println(romanToInt(s7));
    }
}
