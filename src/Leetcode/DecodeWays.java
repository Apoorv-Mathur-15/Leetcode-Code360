package src.Leetcode;

public class DecodeWays {
    public static int numDecodings(String s) {
        if( s.charAt(0)=='0' )
            return 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= '1' && s.charAt(i) <= '9')
                count++;
            if(s.charAt(i) <= '2' && i < s.length()-1){
                if(s.charAt(i+1) <= '6')
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(numDecodings("10"));
        System.out.println(numDecodings("14"));
        System.out.println(numDecodings("05"));
        System.out.println(numDecodings("226"));
    }
}
