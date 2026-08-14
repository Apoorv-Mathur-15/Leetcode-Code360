package src.Leetcode;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();

        for(int num : nums2) {
            while(!stack.isEmpty() && stack.peek()<num){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }

        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=map.getOrDefault(nums1[i],-1);
        }
        return res;
    }

    static void main() {
        int[] res = nextGreaterElement(new int[]{1,2,3}, new int[]{1,2,3,4,5,6,7,8,9});
        for(int i : res)
            System.out.print(i+" ");
    }
}
