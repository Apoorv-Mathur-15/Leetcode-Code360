package src.Leetcode;

public class FindTheJudge {
    public static int findJudge(int n, int[][]trust) {
        int[] score = new int[n + 1];
        for(int[] t : trust){
            int person = t[0];
            int judge = t[1];
            score[person]--;
            score[judge]++;
        }
        for(int i = 1; i <= n; i++){
            if(score[i] == n - 1)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(findJudge(2, new int[][]{{1,2}}));
        System.out.println(findJudge(3, new int[][]{{1,3},{2,3}}));
        System.out.println(findJudge(3, new int[][]{{1,3},{2,3},{3,1}}));
    }
}
