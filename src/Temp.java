package src;

import java.util.Arrays;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        if(n == 0)
            System.out.println(0);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            arr[i] = t;
        }
        Arrays.sort(arr);
        int minimum = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > minimum && arr[i] < 0)
                minimum = arr[i];
            else if (Math.abs(arr[i]) == Math.abs(minimum) && arr[i] != minimum)
                minimum = Math.abs(minimum);
            else if(arr[i] > minimum && arr[i] > 0 && Math.abs(arr[i]) < Math.abs(minimum))
                minimum = arr[i];
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(minimum);

    }
}
