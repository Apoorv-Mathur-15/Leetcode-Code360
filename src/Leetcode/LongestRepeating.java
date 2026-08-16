package src.Leetcode;

public class LongestRepeating {

    public static int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
        int[] res = new int[queryCharacters.length()];
        char[] chars = s.toCharArray();
        for(int i = 0; i < queryCharacters.length(); i++){
            chars[queryIndices[i]] = queryCharacters.charAt(i);
            String newString = String.valueOf(chars);
            //System.out.println(newString);
            res[i] = maxRepeatedSubstring(newString);
        }

        return res;
    }

    private static int maxRepeatedSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        int maxLen = 0, currentLen = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLen++;
            }
            else
                currentLen = 1;
            maxLen = Math.max(maxLen, currentLen);
            //System.out.println(currentLen+" "+maxLen);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = longestRepeating("babacc", "bcb", new int[]{1,3,3});
        for(int i : arr)
            System.out.print(i+" ");
    }
}
