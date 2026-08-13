package src.Leetcode.MathQuest;

import java.util.Arrays;

public class CanMakeArithmeticProgression {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int initialDifference = arr[1] - arr[0];
        for(int i=2; i<arr.length; i++) {
            if(arr[i] - arr[i-1] != initialDifference )
                return false;
        }
        return true;
    }
}
