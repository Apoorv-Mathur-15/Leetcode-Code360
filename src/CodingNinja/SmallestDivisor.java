package src.CodingNinja;

public class SmallestDivisor {
    public static int smallestDivisor(int[] arr, int limit) {
        int left = 1;
        int right = Integer.MAX_VALUE;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int sum = getSum(arr, mid);

            if (sum <= limit) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private static int getSum(int[] arr, int divisor) {
        int sum = 0;
        for (int num : arr) {
            sum += (num + divisor - 1) / divisor;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(smallestDivisor(arr, 8));
    }
}
