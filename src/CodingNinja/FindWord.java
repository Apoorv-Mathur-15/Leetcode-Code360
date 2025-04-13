package src.CodingNinja;

public class FindWord {
    public static boolean findWord(String s, String w){
        String[] words = s.split(" ");
        for(String word : words){
            if(w.equals(word))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(findWord("Lets check the program processing","checking"));
        System.out.println(findWord("Lets check the program processing","program"));
    }
}
