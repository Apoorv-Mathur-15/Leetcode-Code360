package src.Leetcode;

import java.util.Arrays;

public class MedianOf2SortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m+n];
        int k=0, i=0, j=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                nums[k++] = nums1[i++];
            }
            else if(nums2[j]<nums1[i]){
                nums[k++] = nums2[j++];
            }
            else{
                nums[k++] = nums1[i++];
            }
        }
        while(i<m){
            nums[k++] = nums1[i++];
        }
        while(j<n){
            nums[k++] = nums2[j++];
        }
        System.out.println(Arrays.toString(nums));
        double median = 0;
        if ((m+n)%2==0){
            median = ( nums[(m + n) / 2] + nums[ (m + n) / 2 - 1])/2.0;
        }
        else {
            median = nums[(int) Math.floor((double) (m + n) / 2)];
        }
        return median;
    }

    static void main() {
        int[] nums1 = new int[] {1,2};
        int[] nums2 = new int[] {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
