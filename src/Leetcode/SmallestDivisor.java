package src.Leetcode;

public class SmallestDivisor {
    public static int smallestDivisor(int[] nums, int threshold){
        int l= 1, r= 1000000;
        while(l <= r) {
            int m = l + ( r - l ) / 2;
            if(helper(m, nums) > threshold)
                l=m+1;
            else
                r=m-1;
        }
        return l;
    }
    private static int helper(int mid, int[] nums){
        int res= 0;
        for(int num : nums)
            res += (num + mid - 1)/mid;
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int[] nums1 = {44,22,33,11,1};
        System.out.println(smallestDivisor(nums, 6));
        System.out.println(smallestDivisor(nums1, 5));
    }
}
