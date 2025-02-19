package src.CodingNinja;

public class LowerBound {
    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high)
            return low;
        int mid = (low + high) / 2;
        System.out.println(low + " " + mid + " " + high);
        if (arr[mid] == target)
            return mid;
        else if (arr[low] == target)
            return low;
        else if (arr[high] == target)
            return high;
        else if (target > arr[mid])
            return binarySearch(arr, mid + 1, high, target);
        return binarySearch(arr, low, mid - 1, target);
    }


    public static int lowerBound(int[] arr, int n, int x) {
        if (arr[0] >= x)
            return 0;
        else
            return binarySearch(arr, 0, arr.length - 1, x);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 9, 11, 12, 45};
        System.out.println(lowerBound(arr, arr.length, 4));
    }
}
