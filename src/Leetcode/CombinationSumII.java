package src.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrace(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private static void backtrace(List<List<Integer>> result, List<Integer> combination, int[] candidate, int target, int start) {
        if(target == 0){
            result.add(new ArrayList<>(combination));
            return;
        }
        for(int i=start; i < candidate.length && candidate[i] <= target; i++) {
            combination.add(candidate[i]);
            backtrace(result, combination, candidate, target - candidate[i], i);
            combination.remove(combination.size() - 1);
        }
    }
}
