package src;

import java.util.Arrays;
import java.util.Locale;

public class Temp {
    public static void main(String[] args) {
        int arr[] = {5,23,19,7,19};
        System.out.println(Arrays.binarySearch(arr, 19));
        System.out.println(Arrays.binarySearch(arr, 31));
        System.out.println(Arrays.binarySearch(arr, 23));
        System.out.println(Arrays.binarySearch(arr, 7));

        System.out.println("----------------------------------------");
        System.out.println(Locale.getDefault());
        System.out.println(Locale.getDefault().getCountry());

    }
}
