package src.Leetcode;

import java.util.HashMap;

public class BuddyStrings {
    public static boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length())
            return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char c : s.toCharArray())
            map1.put(c, map1.getOrDefault(c,0)+1);

        for(char c : goal.toCharArray())
            map2.put(c, map2.getOrDefault(c,0)+1);

        if(!map2.equals(map1))
            return false;

        int counter = 0;
        int[] sCounts = new int[26];

        if(s.equals(goal)){
            for(int i = 0; i < s.length(); i++){
                sCounts[s.charAt(i) - 'a']++;
                if(sCounts[s.charAt(i) - 'a'] > 1 )
                    return true;
            }
        }
        int[] ij = new int[]{-1, -1};
        for(int i = 0; i < s.length(); i++){
            //System.out.println(s.charAt(i)+" "+goal.charAt(i));
            //System.out.println("i & j before loop run:" +ij[0]+" "+ij[1]);
            if(s.charAt(i) != goal.charAt(i)){
                if(ij[0] != -1 && counter < 2 && ij[1] == -1){
                    //System.out.println("Inside if");
                    if(s.charAt(ij[0]) == goal.charAt(i) && s.charAt(i) == goal.charAt(ij[0])){
                        ij[1] = i;
                    }
                }
                else if(ij[0] == -1) {
                    //System.out.println("Inside else if");
                    ij[0] = i;
                    counter++;
                }
                else {
                    //System.out.println("Inside else");
                    return false;
                }
            }
            //System.out.println("i & j after loop run:" +ij[0]+" "+ij[1]);
        }
        return (ij[0] != -1) && (ij[1] != -1) && counter == 1;
    }

    public static void main(String[] args) {
        System.out.println(buddyStrings("aaaabbbb", "aaba"));
        System.out.println(buddyStrings("ab", "ba"));
        System.out.println(buddyStrings("ab", "ab"));
        System.out.println(buddyStrings("aa", "aa"));
        System.out.println(buddyStrings("abcd", "badc"));
        System.out.println(buddyStrings("abccd", "abddc"));
    }
}
