package src.CodingNinja;

import java.util.Arrays;

public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        int[] array1 = new int[n];
        Arrays.fill(array1, 1);
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                array1[j] += array1[j-1];
            }
        }
        return array1[n-1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
        System.out.println(uniquePaths(2,2));
        System.out.println(uniquePaths(1,1));
    }
}
