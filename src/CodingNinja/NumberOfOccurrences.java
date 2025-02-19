package src.CodingNinja;

public class NumberOfOccurrences {
    public static int count(int[] arr, int n, int x) {
        int[] ans = firstAndLastPositions(arr, n, x);
        if (ans[0] == -1) return 0;
        return (ans[1] - ans[0] + 1);
    }

    private static int[] firstAndLastPositions(int[] arr, int n, int x) {
        int first = firstOccurence(arr, n, x);
        if (first == -1) return new int[]{-1, -1};
        int last = lastOccurence(arr, n, x);
        return new int[]{first, last};
    }

    private static int lastOccurence(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return last;
    }

    private static int firstOccurence(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int first = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3};
        System.out.println(count(arr, arr.length, 1));
    }
}
