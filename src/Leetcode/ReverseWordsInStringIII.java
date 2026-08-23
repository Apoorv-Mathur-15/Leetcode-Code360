package src.Leetcode;

public class ReverseWordsInStringIII {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        String a = words[words.length-1];
        for(int i = 0; i < words.length; i++){
            StringBuilder temp = new StringBuilder(words[i]);
            if(i!=words.length-1)
                sb.append(temp.reverse() + " ");
            else
                sb.append(temp.reverse());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("Mr dInG"));
    }
}
