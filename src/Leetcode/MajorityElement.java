package Leetcode;

public class MajorityElement {

    public static int majorityElement(int[] arr) {
        int count = 1, majority = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (majority == arr[i])
                count++;
            else {
                if (count > 1)
                    count--;
                else
                    majority = arr[i];
            }
        }
        count = 0;
        for (int j : arr) {
            if (j == majority)
                count++;
        }
        if (count >= (arr.length / 2) + 1)
            return majority;
        else
            return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1};
        System.out.println(majorityElement(arr));
    }
}
