package src.Leetcode;

public class JumpII {
    public static int jump(int[] nums){
        int maxReach = 0, steps = 0, end = 0;

        for(int i=0; i<nums.length-1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            if(i == end) {
                end = maxReach;
                steps++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int[] nums1 = {2,3,0,1,4};
        System.out.println(jump(nums));
        System.out.println(jump(nums1));
    }
}
