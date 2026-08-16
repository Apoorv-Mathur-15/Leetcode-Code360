package src.Leetcode;

public class MaximumLengthSubstring {
    public static int maximumLengthSubstring(String s) {
        int[] freq =new int[26];
        char[] arr=s.toCharArray();
        int i=0, len=arr.length, max = 0;
        for(int j=0;j<len;j++){
            ++freq[arr[j]-'a'];
            while(freq[arr[j]-'a'] == 3){
                --freq[arr[i]-'a'];
                i++;
            }
            //System.out.println("Max: " + max + " i: " + i + " j: " + j);
            max = Math.max(max,j-i+1);
        }
        //System.out.println("--------------------------------");
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maximumLengthSubstring("bcbbbcba"));
        System.out.println(maximumLengthSubstring("aaaa"));
        System.out.println(maximumLengthSubstring("aab"));
    }
}
