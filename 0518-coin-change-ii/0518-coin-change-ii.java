class Solution {
    public int change(int amount, int[] coins) {
     return coin(amount,coins);   
    }
    public int coin(int n,int[] arr){
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i:arr){
            for(int j=i;j<=n;j++)
            dp[j]+=dp[j-i];
        }
        return dp[n];
    }
}