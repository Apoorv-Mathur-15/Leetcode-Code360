package src.CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;

public class FindLargerSum {
    public static int findTheLarger(int n, ArrayList<Integer> arr){
        int sumLeft = 0, sumRight = 0;
        for(int i=0; i<n; i++){
            if( i == 0 || arr.get(i) > arr.get(i-1))
                sumLeft += arr.get(i);
            if( i == n - 1 || arr.get(i) > arr.get(i+1))
                sumRight += arr.get(i);
        }
        if(sumLeft == sumRight)
            return -1;
        return (sumLeft > sumRight) ? 0 : 1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,3,5,2,1));
        System.out.println(findTheLarger(arr.size(), arr));
    }
}
