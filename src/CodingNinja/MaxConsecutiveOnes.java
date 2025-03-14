package src.CodingNinja;

import java.util.ArrayList;

public class MaxConsecutiveOnes {
    public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
        int start = 0,  maxLength = 0, zeroCount = 0;
        for(int end = 0; end <n; end++){
            if(arr.get(end) == 0)
                zeroCount++;
            while (zeroCount > k){
                if(arr.get(start) == 0)
                    zeroCount--;
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
