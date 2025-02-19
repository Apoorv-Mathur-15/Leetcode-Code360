package src.CodingNinja;

public class GetFloorAndCeil {

    public static int[] getFloorAndCeil(int[] arr, int n, int x) {
        int[] final_array = new int[2];
        if (arr[0] > x) {
            final_array[0] = -1;
            final_array[1] = arr[0];
            return final_array;
        }
        if (arr[n - 1] < x) {
            final_array[0] = arr[n - 1];
            final_array[1] = -1;
            return final_array;
        }
        int low = 0, high = n - 1, ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (arr[ans] == x) {
            final_array = new int[]{arr[ans], arr[ans]};
        } else if (arr[ans] > x) {
            final_array = new int[]{arr[ans - 1], arr[ans]};
        } else {
            final_array = new int[]{arr[ans], arr[ans]};
        }
        return final_array;
    }

    public static void main(String[] args) {
        int[] arr = {2};
        int[] final_array = getFloorAndCeil(arr, arr.length, 23);
        System.out.println(final_array[0] + " " + final_array[1]);
    }
}
