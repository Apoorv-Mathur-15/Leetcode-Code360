package src.CodingNinja;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSum {
    public static int maxSubarrayLength(int[] arr, int k) {
        Map<Integer, Integer> cnt = new HashMap<>();
        int ans = 0;
        for (int i = 0, j = 0; i < arr.length; ++i) {
            cnt.merge(arr[i], 1, Integer::sum);
            while (cnt.get(arr[i]) > k) {
                cnt.merge(arr[j++], -1, Integer::sum);
            }
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }

    /*
    Time Complexity: O( N^2 )
    Space Complexity: O(1)

    where N is the size of array 'A'.
*/
    public static int longestSubarrayWithSumK(int[] a, int k) {
        int maxLength = 0;
        long currentSum = 0;
        HashMap<Long, Integer> sumMap = new HashMap<>();

        sumMap.put(0L, -1);

        for (int i = 0; i < a.length; i++) {
            currentSum += a[i];
            if (sumMap.containsKey(currentSum - k)) {
                maxLength = Math.max(maxLength, i - sumMap.get(currentSum - k));
            }

            sumMap.putIfAbsent(currentSum, i);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3};
        System.out.println(maxSubarrayLength(arr, 3));
        System.out.println(longestSubarrayWithSumK(arr, 2));
    }
}
