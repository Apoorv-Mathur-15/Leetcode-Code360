package src.CodingNinja;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RearrangeString {
    public static String rearrangeString(String s){
        if(s == null || s.isEmpty())
            return "";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for(char c : s.toCharArray()){
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        maxHeap.addAll(frequencyMap.entrySet());

        if(maxHeap.peek().getValue() > (s.length() + 1) / 2)
            return "NO SOLUTION";

        StringBuilder result = new StringBuilder();
        Map.Entry<Character, Integer> prev = null;

        while (!maxHeap.isEmpty()){
            Map.Entry<Character, Integer> curr = maxHeap.poll();
            result.append(curr.getKey());

            curr.setValue(curr.getValue() - 1);

            if(prev != null && prev.getValue() > 0)
                maxHeap.offer(prev);

            prev = curr;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(rearrangeString("abcca"));
    }
}
