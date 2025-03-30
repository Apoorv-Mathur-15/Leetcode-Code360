package src.CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOneToNumber {
    public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr){
        // Write your code here.
        int n = arr.size();

        for (int i = n - 1; i >= 0; i--) {
            if (arr.get(i) < 9) {
                arr.set(i, arr.get(i) + 1);
                return removeLeadingZeros(arr);
            }

            arr.set(i, 0);
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        result.addAll(arr);

        return result;
    }

    private static ArrayList<Integer> removeLeadingZeros(ArrayList<Integer> arr) {
        int i = 0;
        while (i < arr.size() && arr.get(i) == 0) {
            i++;
        }

        ArrayList<Integer> result = new ArrayList<>(arr.subList(i, arr.size()));

        if (result.isEmpty()) {
            result.add(0);
        }

        return result;
    }
    public static void main(String[] args) {
        // Test cases
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 5, 2));
        System.out.println(addOneToNumber(arr1));  // Output: [1, 5, 3]

        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(0, 2));
        System.out.println(addOneToNumber(arr2));  // Output: [3]

        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(9, 9, 9));
        System.out.println(addOneToNumber(arr3));  // Output: [1, 0, 0, 0]

        ArrayList<Integer> arr4 = new ArrayList<>(Arrays.asList(0, 0, 2));
        System.out.println(addOneToNumber(arr4));  // Output: [3]
    }
}
