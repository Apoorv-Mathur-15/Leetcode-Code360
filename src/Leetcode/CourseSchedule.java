package src.Leetcode;

public class CourseSchedule {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        // graph[i] contains courses that depend on course i
        java.util.List<Integer>[] graph = new java.util.ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new java.util.ArrayList<>();
        }

        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prerequisiteCourse = prerequisite[1];

            graph[prerequisiteCourse].add(course);
        }

        // 0 = unvisited, 1 = visiting, 2 = finished
        int[] state = new int[numCourses];

        for (int course = 0; course < numCourses; course++) {
            if (hasCycle(course, graph, state)) {
                return false;
            }
        }

        return true;
    }

    private static boolean hasCycle(
            int course,
            java.util.List<Integer>[] graph,
            int[] state) {

        // We found a course currently in our DFS path
        if (state[course] == 1) {
            return true;
        }

        // Already completely processed
        if (state[course] == 2) {
            return false;
        }

        state[course] = 1; // currently visiting

        for (int nextCourse : graph[course]) {
            if (hasCycle(nextCourse, graph, state)) {
                return true;
            }
        }

        state[course] = 2; // completely processed
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canFinish(2, new int[][]{{1, 0}})); // true
        System.out.println(canFinish(2, new int[][]{{1, 0}, {0, 1}})); // false
    }
}
