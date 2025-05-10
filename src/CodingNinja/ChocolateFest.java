package src.CodingNinja;

import java.util.ArrayList;

public class ChocolateFest {
    public static ArrayList<Integer> chocolateFest(ArrayList<Integer> choco, int x){
        ArrayList<Integer> list = new ArrayList<>();
        int n = choco.size(), start = 0, end = 0, sum = 0, minLen = Integer.MAX_VALUE, minStart = 0;
        while (end < n) {
            sum += choco.get(end);

            while (sum > x) {
                if((end - start + 1) < minLen){
                    minLen = end - start + 1;
                    minStart = start;
                }
                sum -= choco.get(start);
                start++;
            }
            end++;
        }
        for(int i=minStart; i<minStart + minLen; i++){
            list.add(choco.get(i));
        }
        return list;
    }
}
