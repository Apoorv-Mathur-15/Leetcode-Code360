package src.Leetcode;

public class CountKDifference {
    public static int countKDifference(int nums[], int k) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length; j++) {
                if (Math.absExact(nums[j] - nums[i]) == k)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 3;
        a[1] = 2;
        a[2] = 1;
        a[3] = 5;
        a[4] = 4;
        System.out.println(countKDifference(a, 2));
    }
}
