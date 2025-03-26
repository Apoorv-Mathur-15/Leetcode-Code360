package src.CodingNinja;

public class MakeStringSmaller {
    static int makeStringSmaller(int n, String s, String t){
        for(int i=0; i<n; i++){
            if(s.charAt(i) < t.charAt(i))
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(makeStringSmaller(3, "cab", "abc"));
    }
}
