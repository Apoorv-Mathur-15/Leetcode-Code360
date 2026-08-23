package src.Leetcode;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0)
            return true;
        int maxJump = 0;
        for(int i=0; i<nums.length; i++){
            if(i > maxJump)
                return false;
            maxJump = Math.max(maxJump, i + nums[i]);
            if(maxJump >= nums.length-1)
                return true;
        }
        return false;
    }
}
