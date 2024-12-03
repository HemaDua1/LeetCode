class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] score=new int[n+1];
        for(int[] r:trust){
            int a=r[0];
            int b=r[1];
            score[a]--;
            score[b]++;
        }
        for(int i=1;i<=n;i++){
            if(score[i]==n-1)
            return i;
        }
        return -1;
    }
}