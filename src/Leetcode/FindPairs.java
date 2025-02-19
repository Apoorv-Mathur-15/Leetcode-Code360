package src.Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindPairs {
    public static int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        HashSet<Integer> unique = new HashSet();
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.absExact(nums[j] - nums[i]) == k) {
                    if (unique.contains(nums[j]) && unique.contains(nums[i])) {
                        continue;
                    } else {
                        unique.add(nums[i]);
                        unique.add(nums[j]);
                        count++;
                        System.out.println(nums[i] + " " + nums[j]);
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = new int[100];
        a[0] = 2;
        a[1] = 9;
        a[2] = 0;
        a[3] = 8;
        a[4] = 9;
        a[5] = 6;
        a[6] = 5;
        a[7] = 9;
        a[8] = 8;
        a[9] = 1;
        a[10] = 9;
        a[11] = 6;
        a[12] = 9;
        a[13] = 2;
        a[14] = 8;
        a[15] = 8;
        a[16] = 7;
        a[17] = 5;
        a[18] = 7;
        a[19] = 8;
        a[20] = 8;
        a[21] = 3;
        a[22] = 7;
        a[23] = 4;
        a[24] = 1;
        a[25] = 1;
        a[26] = 6;
        a[27] = 2;
        a[28] = 9;
        a[29] = 9;
        a[30] = 3;
        a[31] = 9;
        a[32] = 2;
        a[33] = 4;
        a[34] = 6;
        a[35] = 5;
        a[36] = 6;
        a[37] = 5;
        a[38] = 1;
        a[39] = 5;
        a[40] = 9;
        a[41] = 9;
        a[42] = 8;
        a[43] = 1;
        a[44] = 4;
        a[45] = 3;
        a[46] = 2;
        a[47] = 8;
        a[48] = 5;
        a[49] = 3;
        a[50] = 5;
        a[51] = 4;
        a[52] = 5;
        a[53] = 7;
        a[54] = 0;
        a[55] = 0;
        a[56] = 7;
        a[57] = 6;
        a[58] = 4;
        a[59] = 7;
        a[60] = 2;
        a[61] = 4;
        a[62] = 9;
        a[63] = 3;
        a[64] = 6;
        a[65] = 6;
        a[66] = 5;
        a[67] = 0;
        a[68] = 0;
        a[69] = 0;
        a[70] = 8;
        a[71] = 9;
        a[72] = 9;
        a[73] = 6;
        a[74] = 5;
        a[75] = 4;
        a[76] = 6;
        a[77] = 2;
        a[78] = 1;
        a[79] = 3;
        a[80] = 2;
        a[81] = 5;
        a[82] = 0;
        a[83] = 1;
        a[84] = 4;
        a[85] = 2;
        a[86] = 6;
        a[87] = 9;
        a[88] = 5;
        a[89] = 4;
        a[90] = 9;
        a[91] = 6;
        a[92] = 0;
        a[93] = 8;
        a[94] = 3;
        a[95] = 8;
        a[96] = 0;
        a[97] = 0;
        a[98] = 2;
        a[99] = 1;
        System.out.println(findPairs(a, 1));
    }
}
