package src.Leetcode;

public class ContainsDuplicatesIII {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (j - i > indexDiff) {
                    break;
                }
                if (Math.abs((long) nums[i] - nums[j]) <= valueDiff) {
                    return true;
                }
            }
        }
        return false;
    }


    static void main() {
        System.out.println(containsNearbyAlmostDuplicate(new int[]{1, 2, 3, 1}, 3, 0));
        System.out.println(containsNearbyAlmostDuplicate(new int[]{1, 5, 9, 1, 5, 9}, 2, 3));
    }
}
