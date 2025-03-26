package src.CodingNinja;

public class MaximizeCharacter {
    public static char maximizeCharacter(int n, StringBuilder s){
        char ans = 'a';
        for(int i=0; i<n; i++){
            if(s.charAt(i) == ans + 1 || s.charAt(i) == ans + 2)
                ans = s.charAt(i);
        }
        return ans;
    }
}
