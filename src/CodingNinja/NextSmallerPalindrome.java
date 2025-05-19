package src.CodingNinja;

public class NextSmallerPalindrome {
    public static String nextSmallerPalindrome(String s){
        int n = s.length();
        if(s.equals("1")){
            //System.out.println("First if returned");
            return "0";
        }
        boolean allZeroOrOne = true;
        for(int i=1; i<n; i++){
            if(s.charAt(i) != '0'){
                allZeroOrOne = false;
                break;
            }
        }
        if(s.charAt(0) == '1' && allZeroOrOne){
            //System.out.println("Second if returned for n: "+n);
            return "9".repeat(n-1);
        }

        String left = s.substring(0, (n+1)/2);
        //System.out.println("First call to mirror for left: "+left);
        String mirrored = mirror(left, n % 2 == 1);
        //System.out.println("First call to mirror returned mirrored as: "+mirrored);
        if(mirrored.compareTo(s) < 0)
            return mirrored;

        left = decrement(left);
        if (left.length() < (n + 1) / 2 || left.charAt(0) == '0') {
            return "9".repeat(n - 1);
        }
        mirrored = mirror(left, n % 2 == 1);
        return mirrored;
    }

    private static String decrement(String num) {
        char[] chars = num.toCharArray();
        int i = chars.length - 1;
        while (i >= 0 && chars[i] == '0'){
            chars[i] = '9';
            i--;
        }
        if(i >= 0)
            chars[i]--;
        if(chars[0] == '0')
            return "9".repeat(chars.length - 1);
        String result = new String(chars);
        result = result.replaceFirst("^0+(?!$)", "");
        return result.isEmpty() ? "0" : result;
    }

    private static String mirror(String left, boolean isOdd) {
        StringBuilder stringBuilder = new StringBuilder(left);
        //System.out.println("Inside mirror for left: "+left+" and isOdd: "+isOdd);
        if(isOdd)
            return left + stringBuilder.deleteCharAt(stringBuilder.length() - 1).reverse().toString();
        else
            return left + stringBuilder.reverse().toString();

    }

    public static void main(String[] args) {
        //System.out.println(nextSmallerPalindrome("11"));
        System.out.println(nextSmallerPalindrome("101"));
    }
}
