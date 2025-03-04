package src.CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseTheArray {
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int j = 0;
        for(int i = 0; i< arr.size(); i++) {
            if(i < m){
                result.add(arr.get(i));
            }
            else {
                result.add(arr.get(arr.size() -j -1));
                j++;
            }
        }
        for(int i : result)
            System.out.print(i+" ");
    }

    public static void main(String[] args) {
        ArrayList arr = (ArrayList) Arrays.asList(1,2,3,4,5);
        reverseArray(arr, 2);
    }
}
