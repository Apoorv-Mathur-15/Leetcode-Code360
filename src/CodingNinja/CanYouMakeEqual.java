package src.CodingNinja;

public class CanYouMakeEqual {
    public static int canYouMakeEqual(int n, String s, String t){
        int i = 0, j = 0;
        while (i < n && j < n + 1){
            if(s.charAt(i) == t.charAt(j))
                i++;
            j++;
        }
        return i == n ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(canYouMakeEqual(3, "aaa", "aaaa"));
        System.out.println(canYouMakeEqual(4, "abab", "abbba"));
    }
}
