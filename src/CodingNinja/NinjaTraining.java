package src.CodingNinja;

public class NinjaTraining {

    public static int ninjaTraining(int n, int[][] points) {
        // dp[i][j] represents the maximum merit points earned up to day i,
        // with activity j performed on day i.
        // j = 0: Running
        // j = 1: Fighting Practice
        // j = 2: Learning New Moves

        // Create a 2D array to store DP states.
        // We can optimize space to O(1) by only keeping track of the previous day's DP values.
        // Let's use O(N) space first for clarity, then discuss O(1) optimization.
        int[][] dp = new int[n][3];

        // Base case: For the first day (day 0)
        dp[0][0] = points[0][0]; // If running on day 0
        dp[0][1] = points[0][1]; // If fighting on day 0
        dp[0][2] = points[0][2]; // If learning on day 0

        // Iterate from day 1 up to n-1
        for (int day = 1; day < n; day++) {
            // If running on current 'day'
            // Ninja could have done fighting (1) or learning (2) on the previous day (day-1)
            dp[day][0] = points[day][0] + Math.max(dp[day - 1][1], dp[day - 1][2]);

            // If fighting on current 'day'
            // Ninja could have done running (0) or learning (2) on the previous day (day-1)
            dp[day][1] = points[day][1] + Math.max(dp[day - 1][0], dp[day - 1][2]);

            // If learning on current 'day'
            // Ninja could have done running (0) or fighting (1) on the previous day (day-1)
            dp[day][2] = points[day][2] + Math.max(dp[day - 1][0], dp[day - 1][1]);
        }

        // The maximum merit points will be the maximum of the last day's DP values
        return Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2]));
    }

    // Space optimized dynamic programming solution (O(1) space)
    public static int ninjaTrainingSpaceOptimized(int n, int[][] points) {
        // We only need to store the maximum points for the previous day's activities.
        int[] prevDayDp = new int[3];

        // Base case: For the first day (day 0)
        prevDayDp[0] = points[0][0];
        prevDayDp[1] = points[0][1];
        prevDayDp[2] = points[0][2];

        // Iterate from day 1 up to n-1
        for (int day = 1; day < n; day++) {
            int[] currentDayDp = new int[3];

            // If running on current 'day'
            currentDayDp[0] = points[day][0] + Math.max(prevDayDp[1], prevDayDp[2]);

            // If fighting on current 'day'
            currentDayDp[1] = points[day][1] + Math.max(prevDayDp[0], prevDayDp[2]);

            // If learning on current 'day'
            currentDayDp[2] = points[day][2] + Math.max(prevDayDp[0], prevDayDp[1]);

            // Update prevDayDp for the next iteration
            prevDayDp = currentDayDp;
        }

        // The maximum merit points will be the maximum of the last day's DP values
        return Math.max(prevDayDp[0], Math.max(prevDayDp[1], prevDayDp[2]));
    }


    public static void main(String[] args) {
        // Test case 1
        int[][] points1 = {{1, 2, 5}, {3, 1, 1}, {3, 3, 3}};
        System.out.println("Test Case 1 (DP): " + ninjaTraining(3, points1)); // Expected: 11
        System.out.println("Test Case 1 (Space Optimized DP): " + ninjaTrainingSpaceOptimized(3, points1)); // Expected: 11

        // Test case 2
        int[][] points2 = {{10, 40, 70}, {20, 50, 80}, {30, 60, 90}};
        System.out.println("Test Case 2 (DP): " + ninjaTraining(3, points2)); // Expected: 210
        System.out.println("Test Case 2 (Space Optimized DP): " + ninjaTrainingSpaceOptimized(3, points2)); // Expected: 210

        // Test case 3 (from sample input 2)
        int[][] points3 = {{18, 11, 19}, {4, 13, 7}, {1, 8, 13}};
        System.out.println("Test Case 3 (DP): " + ninjaTraining(3, points3)); // Expected: 45
        System.out.println("Test Case 3 (Space Optimized DP): " + ninjaTrainingSpaceOptimized(3, points3)); // Expected: 45

        // Test case 4 (from sample input 2)
        int[][] points4 = {{10, 50, 1}, {5, 100, 11}};
        System.out.println("Test Case 4 (DP): " + ninjaTraining(2, points4)); // Expected: 110
        System.out.println("Test Case 4 (Space Optimized DP): " + ninjaTrainingSpaceOptimized(2, points4)); // Expected: 110

        // Example where greedy *might* fail (though it worked for my test case in my reasoning above)
        // This is primarily to highlight the difference in approach.
        int[][] pointsGreedyFail = {{10, 1, 100}, {100, 1, 10}, {1, 100, 1}};
        System.out.println("Greedy Fail Example (DP): " + ninjaTraining(3, pointsGreedyFail)); // Expected: 300
        System.out.println("Greedy Fail Example (Space Optimized DP): " + ninjaTrainingSpaceOptimized(3, pointsGreedyFail)); // Expected: 300

        // Output of the original greedy code for pointsGreedyFail
        // ninjaTraining from the original code would print out intermediate steps
        // If you were to run the original method, it would also give 300 for this specific case.
        // However, the core concept of greedy vs DP remains relevant for this type of problem.
    }
}