package CodingNinja;

public class Rotation {
    public static int findKRotation(int[] arr) {
        int low = 0, high = arr.length - 1, min = 0;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            //search space is already sorted
            //then arr[low] will always be
            //the minimum in that search space:
            if (arr[low] <= arr[high]) {
                if (arr[low] < ans) {
                    min = low;
                    //System.out.println(min);
                }
                break;
            }

            //if left part is sorted:
            if (arr[low] <= arr[mid]) {
                // keep the minimum:
                if (arr[low] < ans) {
                    min = low;
                    //System.out.println(min);
                }
                // Eliminate left half:
                low = mid + 1;

            } else { //if right part is sorted:

                // keep the minimum:
                if (arr[mid] < ans) {
                    min = low;
                    //System.out.println(min);
                }
                // Eliminate right half:
                high = mid - 1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 0, 1, 2};
        int[] arr1 = {2, 3, 4, 1};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(findKRotation(arr2));
    }

}
