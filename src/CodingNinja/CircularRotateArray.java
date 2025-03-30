package src.CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;

public class CircularRotateArray {
    public static void rotate(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> newArr = new ArrayList<>();
        newArr.add(arr.get(n-1));
        for(int i=0; i<n-1; i++){
            newArr.add(arr.get(i));
        }
        arr = newArr;
        for(int i : arr)
            System.out.print(i+" ");
    }

    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        rotate(arr, arr.size());
    }
}
