package src.CodingNinja;

import java.util.ArrayList;

public class FindPeakElement {
    public static int findPeakElement(ArrayList<Integer> arr) {
        for(int i=1; i< arr.size() - 1; i++){
            int prev = arr.get(i - 1);
            int next = arr.get(i + 1);
            int curr = arr.get(i);
            if(curr > prev && curr > next)
                return i;
        }
        if(arr.get(arr.size()-1) > arr.get(arr.size()-2))
            return arr.size()-1;
        if(arr.get(0) > arr.get(1))
            return 0;
        return -1;
    }
}
