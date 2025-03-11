package src.CodingNinja;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int n){
        Arrays.sort(arr);
        //for(int i : arr)
        //System.out.print(i+" ");
        //System.out.println();
        int max = 1, prev=0;
        for(int i=1; i<arr.length; i++){
            //System.out.println("i= "+i);
            if(arr[i-1] + 1 == arr[i]){
                //System.out.println("If Block, max:"+max);
                max = max + 1;
            }
            else if (arr[i-1] == arr[i]) {
                max = max;
                //System.out.println("Else If Block, max:"+max);
            } else{
                prev = Math.max(prev, max);
                max = 1;
                //System.out.println("Else Block, max:"+max);
            }
        }
        return Math.max(max, prev);
    }

    public static void main(String[] args) {
        int[] arr = {9,5,4,9,10,10,10,6};
        int[] arr1 = {33,20,34,30,35};
        int[] arr2 = {1,9,3,10,4,20,2};
        System.out.println(lengthOfLongestConsecutiveSequence(arr, arr.length));
        System.out.println(lengthOfLongestConsecutiveSequence(arr1, arr1.length));
        System.out.println(lengthOfLongestConsecutiveSequence(arr2, arr2.length));
    }
}
