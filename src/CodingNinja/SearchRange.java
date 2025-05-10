package src.CodingNinja;

public class SearchRange {
    public static int[] searchRange(int[] arr, int x){
        int firstIndex = -1, lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }
        return new int[]{firstIndex, lastIndex};
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5};
        int[] result = searchRange(arr, 4);
        System.out.println(result[0] + " " + result[1]);
    }
}
