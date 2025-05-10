package src.CodingNinja;

import java.util.ArrayList;

public class MaxSumSubArray {
    public static ArrayList<Integer> maximumSumSubarray(int n, int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int maxSum = arr[0], currentSum = arr[0], start = 0, end = 0, tempStart = 0;
        for(int i=1; i<n; i++){
            if(currentSum + arr[i] < arr[i]){
                currentSum = arr[i];
                tempStart = i;
            }
            else
                currentSum += arr[i];

            if(currentSum > maxSum || (currentSum == maxSum && (i - tempStart > end - start))){
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }
        for(int i = start; i<=end; i++){
            list.add(arr[i]);
        }
        return list;
    }
}
