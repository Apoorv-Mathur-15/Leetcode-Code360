package src.CodingNinja;

import java.util.ArrayList;
import java.util.List;

public class LeftRotationOfList {
    public static List<ArrayList<Integer>> leftRotationsOfArray(List<Integer> nums, List<Integer> queries) {
        List<ArrayList<Integer>> result = new ArrayList<>();
        for(int query : queries) {
            result.add(rotateList(nums, query));
        }
        return result;
    }

    private static ArrayList<Integer> rotateList(List<Integer> nums, int query) {
        int q = query % nums.size();
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(nums.subList(q, nums.size()));
        list.addAll(nums.subList(0,q));
        return list;
    }
}
