package src.CodingNinja;

import java.util.PriorityQueue;

public class ProblemStatement {
    public static long[] problemSelection(int[] a, int k) {
        long minMarks = getMinMarks(a, k);
        long maxMarks = getMaxMarks(a, k);
        return new long[]{minMarks, maxMarks};
    }

    private static long getMaxMarks(int[] a, int k) {
        int n = a.length;
        boolean[] used = new boolean[n];
        long total = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((i,j) -> a[j] - a[i]);
        for(int i=0; i<n; i++)
            maxHeap.offer(i);
        while (!maxHeap.isEmpty()){
            int index = maxHeap.poll();
            if(used[index])
                continue;
            used[index] = true;
            total += a[index];

            PriorityQueue<Integer> minHeap = new PriorityQueue<>((i,j) -> a[i] - a[j]);
            for(int i=0; i<n; i++){
                if(!used[i])
                    minHeap.offer(i);
            }
            for(int i=0; i<k && !minHeap.isEmpty(); i++)
                used[maxHeap.poll()] = true;
        }
        return total;
    }

    private static long getMinMarks(int[] a, int k) {
        int n = a.length;
        boolean[] used = new boolean[n];
        long total = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((i, j) -> a[i] - a[j]);
        for(int i=0; i<n; i++)
            minHeap.offer(i);
        while (!minHeap.isEmpty()){
            int index = minHeap.poll();
            if(used[index])
                continue;
            used[index] = true;
            total += a[index];

            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((i,j) -> a[j] - a[i]);
            for(int i=0; i<n; i++){
                if(!used[i])
                    maxHeap.offer(i);
            }
            for(int i=0; i<k && !maxHeap.isEmpty(); i++)
                used[maxHeap.poll()] = true;
        }
        return total;
    }

}
