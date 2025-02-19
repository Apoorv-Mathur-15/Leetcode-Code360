package Leetcode;

public class KthSmallestProduct {

    static long inf = (long) 1e10;

    public static long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        int n = nums2.length;
        long lo = -inf - 1;
        long hi = inf + 1;
        while (lo < hi) {
            long mid = lo + ((hi - lo) >> 1);
            long cnt = 0;
            for (int i : nums1) {
                int l = 0;
                int r = n - 1;
                int p = 0;
                if (0 <= i) {
                    while (l <= r) {
                        int c = l + ((r - l) >> 1);
                        long mul = i * (long) nums2[c];
                        if (mul <= mid) {
                            p = c + 1;
                            l = c + 1;
                        } else {
                            r = c - 1;
                        }
                    }
                } else {
                    while (l <= r) {
                        int c = l + ((r - l) >> 1);
                        long mul = i * (long) nums2[c];
                        if (mul <= mid) {
                            p = n - c;
                            r = c - 1;
                        } else {
                            l = c + 1;
                        }
                    }
                }
                cnt += p;
            }
            if (cnt >= k) {
                hi = mid;
            } else {
                lo = mid + 1L;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        int[] a = {-4, -2, 0, 3};
        int[] b = {2, 4};
        System.out.println(kthSmallestProduct(a, b, 6));

    }
}
