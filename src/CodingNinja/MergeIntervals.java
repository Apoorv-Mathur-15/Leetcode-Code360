package src.CodingNinja;

import java.util.ArrayList;
import java.util.Collections;

public class MergeIntervals {

    public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervals) {
        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        ArrayList<Interval> merged = new ArrayList<>();
        for (Interval interval : intervals) {
            if (merged.isEmpty() || interval.start > merged.get(merged.size() - 1).end)
                merged.add(interval);
            else
                merged.get(merged.size() - 1).end = Math.max(merged.get(merged.size() - 1).end, interval.end);
        }
        return merged;
    }
    class Interval {
        int start;
        int end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

}
