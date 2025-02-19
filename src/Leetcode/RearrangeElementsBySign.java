package src.Leetcode;

public class RearrangeElementsBySign {

    public static int[] rearrangeArray(int[] arr) {
        int[] final_array = new int[arr.length];
        int odd = 1, even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                final_array[odd] = arr[i];
                odd += 2;
            } else {
                final_array[even] = arr[i];
                even += 2;
            }
        }
        return final_array;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] final_array = rearrangeArray(arr);
        for (int i : final_array)
            System.out.print(i + " ");
    }
}
