package src.CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingAndRepeatingNumbers {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n){
        int[] result = new int[2];
        int[] a = new int[n];
        int j = 0;
        for(int i : arr){
            a[j] = i;
            j++;
        }
        Arrays.sort(a);
        for(int i=1; i<n; i++){
            if(a[0] != 1)
                result[0] = 1;
            if (a[n-1] != n)
                result[0] = n;
            if(a[i-1] + 1 == a[i])
                continue;
            else if (a[i] == a[i-1]) {
                result[1] = a[i];
            }
            else
                result[0] = a[i] - 1;
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        int[] result = missingAndRepeating(arr, arr.size());
        for (int i : result)
            System.out.println(i);
    }
}
