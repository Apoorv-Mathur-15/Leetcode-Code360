package src.CodingNinja;

public class ReverseString {
    public static String reverseString(String s){
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(int i=words.length-1; i>=0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Lets test if it works"));
    }
}
