package src.CodingNinja;

public class Hacker {
    public static String hack(String n){
        StringBuilder stringBuilder = new StringBuilder();
        int[] freq = new int[10];
        for(char c : n.toCharArray()){
            freq[Integer.parseInt(String.valueOf(c))]++;
        }
        for(int i=9; i>=0; i--){
            while (freq[i] > 0){
                stringBuilder.append(i);
                freq[i]--;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(hack("122"));
    }
}
