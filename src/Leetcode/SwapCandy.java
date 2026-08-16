package src.Leetcode;

import java.util.HashSet;

public class SwapCandy {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aSum = 0, bSum = 0;
        int[] ans = new int[2];
        for(int i : aliceSizes) {
            aSum += i;
        }
        for(int i : bobSizes) {
            bSum += i;
        }
        int diff = aSum - bSum;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : aliceSizes) {
            set.add(i);
        }
        for(int i : bobSizes) {
            if(set.contains(i + diff / 2)) {
                ans[0] = i + diff / 2;
                ans[1] = i;
                break;
            }
        }
        return ans;
    }

    static void main() {
        int[] ans = fairCandySwap(new int[] {2}, new int[] {1,3});
        for(int i : ans) {
            System.out.print(i + " ");
        }
    }
}
