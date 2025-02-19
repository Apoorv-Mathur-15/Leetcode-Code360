package src.Leetcode;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i, x = 0, k = 0;
        for (i = 0; i < n; i++) {
            if (nums[i] == val)
                x++;
            else {
                nums[k] = nums[i];
                k++;
            }
        }
        return n - x;
    }

    public static void main(String[] args) {

    }
}
