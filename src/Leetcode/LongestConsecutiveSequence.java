package src.Leetcode;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0) return 0;
        int maxLen = 0, currLen = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] + 1 ==  nums[i]){
                currLen++;
            }
            else if(nums[i - 1] == nums[i])
                continue;
            else{
                maxLen = Math.max(maxLen, currLen);
                currLen = 1;
            }
        }
        maxLen = Math.max(maxLen, currLen);
        return maxLen;
    }

    static void main() {
        System.out.println(longestConsecutive(new int[]{1,2,3,4,5}));
        System.out.println(longestConsecutive(new int[]{1,0,1,2}));
        System.out.println(longestConsecutive(new int[]{}));
        System.out.println(longestConsecutive(new int[]{100,0,1,3,4,2,5,220}));
    }
}
