package src.CodingNinja;

public class HateEquality {
    public static int canYouMakeDifference(int n, String s){
        if(n == 1)
            return 0;
        for(int i=1; i<n; i++){
            if(s.charAt(0) != s.charAt(i))
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(canYouMakeDifference(4,"aaaa"));
        System.out.println(canYouMakeDifference(4,"aaab"));
        System.out.println(canYouMakeDifference(7,"abascas"));
    }
}
