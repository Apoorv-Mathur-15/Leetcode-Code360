package src.CodingNinja;

public class KokoEatingBananas {
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr)
            max = Math.max(i, max);
        return max;
    }

    public static int calculateTotalHours(int[] arr, int h) {
        int totalH = 0;
        for (int i : arr)
            totalH += Math.ceil((double) i / (double) h);
        return totalH;
    }

    public static int minimumRateToEatBananas(int[] arr, int h) {
        int low = 0, high = findMax(arr);
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateTotalHours(arr, mid);
            if (totalH <= h)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 8};
        System.out.println(minimumRateToEatBananas(arr, 7));
    }
}
