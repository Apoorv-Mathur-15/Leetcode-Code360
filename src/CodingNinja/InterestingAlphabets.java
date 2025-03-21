package src.CodingNinja;

import java.util.ArrayList;

public class InterestingAlphabets {
    public static ArrayList<ArrayList<Character>> interestingPattern(int n){
        ArrayList<ArrayList<Character>> finalList = new ArrayList<>();
        for( int i=1; i<=n; i++ ){
            ArrayList<Character> list = new ArrayList<>();
            for(int j=i; j>0; j--){
                list.add((char) ('A' + n - j));
                //System.out.print(Character.toString('A' + n - j - 1));
            }
            //System.out.println();
            finalList.add(list);
        }
        return finalList;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Character>> finalList = interestingPattern(5);
        for(ArrayList<Character> list : finalList){
            for(Character c : list)
                System.out.print(c);
            System.out.println();
        }
    }
}
