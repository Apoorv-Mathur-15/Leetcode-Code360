package src.CodingNinja;

public class LongestRepeatingSubstring {
    public static int longestRepeatingSubstring(String str, int k){
        int n = str.length(), maxLength = 0, start = 0, maxFreq = 0;
        int[] freq = new int[26];

        for(int i = 0; i < n; i++){
            char endChar = str.charAt(i);
            freq[endChar - 'A']++;
            maxFreq = Math.max(maxFreq, freq[endChar - 'A']);

            if(i - start + 1 - maxFreq > k){
                char startChar = str.charAt(start);
                freq[startChar - 'A']--;
                start++;
            }
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestRepeatingSubstring("AABC", 1));
    }
}
