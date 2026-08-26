package src.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        List<String> res = new ArrayList<>();
        if(nums.length == 1) {
            res.add(String.valueOf(nums[0]));
            return res;
        }
        int i = 0, prev = nums[0];
        while (i < nums.length - 1) {
            //System.out.println("At start, i, prev, nums, nums+1: " + i + " " + prev + " " + nums[i] + " " + nums[i + 1]);
            if(nums[i] + 1 != nums[i+1]){
                if(nums[i] == prev)
                    res.add(String.valueOf(nums[i]));
                else
                    res.add(prev + "->" + nums[i]);
                prev = nums[i+1];
            }
            if(i == nums.length - 2) {
                if(prev != nums[i+1])
                    res.add(prev + "->" + nums[i+1]);
                else if (nums[i] == prev || nums[i+1] == prev)
                    res.add(String.valueOf(nums[i+1]));

            }
            //System.out.println("At end,   i, prev, nums, nums+1: " + i + " " + prev + " " + nums[i] + " " + nums[i + 1]);
            i++;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}));
        System.out.println(summaryRanges(new int[]{0,2,3,4,6,8,9}));
        System.out.println(summaryRanges(new int[]{1,2,4}));
        System.out.println(summaryRanges(new int[]{0,1,2,4}));
        System.out.println(summaryRanges(new int[]{1}));
        System.out.println(summaryRanges(new int[]{1,2}));
        System.out.println(summaryRanges(new int[]{1,3}));
        System.out.println(summaryRanges(new int[]{1,2,3}));
        System.out.println(summaryRanges(new int[]{1,2,3,5}));
        System.out.println(summaryRanges(new int[]{1,2,4,5}));
        System.out.println(summaryRanges(new int[]{1,2,3,5,6,7}));
        System.out.println(summaryRanges(new int[]{}));
    }
}
