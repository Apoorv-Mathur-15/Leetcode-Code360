package src.Leetcode;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        int[] map = new int[128];
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        int n = s1.length;
        for (int i = 0; i < n; i++) {
            if (map[s2[i]] == 0) {
                if (search(map, s1[i], s2[i]) != -1)
                    return false;
                map[s2[i]] = s1[i];
            } else {
                if (map[s2[i]] != s1[i])
                    return false;
            }
        }
        return true;
    }

    private static int search(int[] map, int str, int skip) {
        for (int i = 0; i < 128; i++) {
            if (i == skip)
                continue;
            if (map[i] != 0 && map[i] == str)
                return i;
        }
        return -1;
    }
}
