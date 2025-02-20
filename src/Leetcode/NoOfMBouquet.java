package src.Leetcode;

public class NoOfMBouquet {
    public static boolean possible(int[] arr, int day, int m, int k) {
        int count = 0, numberOfBouquets = 0;
        for (int i : arr) {
            if (i <= day)
                count++;
            else {
                numberOfBouquets += count / k;
                count = 0;
            }
        }
        numberOfBouquets += count / k;
        return numberOfBouquets >= m;
    }

    public static int minDays(int[] arr, int m, int k) {
        long val = (long) m * k;
        int n = arr.length;
        if (val > n)
            return -1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i : arr) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        int low = min, high = max;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possible(arr, mid, m, k))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int ans = minDays(arr, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
    }
}
