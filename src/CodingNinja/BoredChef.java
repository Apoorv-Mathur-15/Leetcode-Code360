package src.CodingNinja;

public class BoredChef {
    public static int boredChef(int n, int k, String s){
        int ans = 0;
        for(char ch ='a'; ch<='z'; ch++ ){
            int count = 0;
            for(char c : s.toCharArray()){
                if(ch == c)
                    count++;
            }
            if(count >= k)
                ans = 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(boredChef(5, 2, "acdab"));
    }
}
