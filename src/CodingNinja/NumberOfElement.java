package src.CodingNinja;

import java.util.Arrays;

public class NumberOfElement {
    public static int numberOfElelment(int n, int[] arr){
        int ans = 0;
        for(int i=0; i<n; i++){
            int prev = 0, next = 0;
            if(i > 0)
                prev = arr[i - 1];
            if(i < n - 1)
                next = arr[i + 1];
            int[] triplet = {prev, arr[i], next};
            Arrays.sort(triplet);

            if (triplet[1] == arr[i]) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numberOfElelment(3, new int[]{1, 3, 5}));
    }
}
