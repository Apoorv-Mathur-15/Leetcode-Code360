package src.Leetcode;

public class WiggleSort {
    public static void wiggleSort(int[] nums) {
        for(int i=0; i< nums.length - 1; i++){
            if((i % 2 == 0 && nums[i] > nums[i + 1]) || (i % 2 == 1 && nums[i] < nums[i + 1])){
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
        for(int i : nums)
            System.out.print(i+" ");
    }

    static void main(String[] args) {
        wiggleSort(new int[] {1,5,1,1,6,4});
    }
}
