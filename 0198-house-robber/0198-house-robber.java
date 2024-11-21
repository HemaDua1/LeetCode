class Solution {
    public int rob(int[] n) {
int l=n.length;
if(l==0)
return 0;
int[] dp=new int[l];
Arrays.fill(dp,-1);
return ans(l-1,dp,n);
    }
    public static int ans(int i,int[] dp,int[] nums){
        if(i<0)
        return 0;
        if(i==0)
        return nums[i];
        if(dp[i]!=-1)
        return dp[i];
        int a=ans(i-1,dp,nums);
        int b=ans(i-2,dp,nums)+nums[i];
        dp[i]=Math.max(a,b);
        return dp[i];
    }
}