package src.CodingNinja;

public class RemoveDuplicates {
    public static String removeConsecutiveDuplicates(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i))
                continue;
            else
                stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "aabccba";
        String s1 = "xxxyyyzwwzzz";
        System.out.println(removeConsecutiveDuplicates(s));
        System.out.println(removeConsecutiveDuplicates(s1));
    }
}
