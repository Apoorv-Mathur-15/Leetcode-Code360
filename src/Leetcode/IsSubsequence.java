package src.Leetcode;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int i=0, j=0, n=t.length(), m=s.length();
        if(m == 0)
            return true;
        while (j < n){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                if(i == m)
                    return true;
            }
            j++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
        System.out.println(isSubsequence("abhc","ahbgdc"));
    }
}
