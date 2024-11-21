class Solution {
    public int rob(int[] nums) {
     int l=nums.length;
if(l==0)
return 0;
if(l==1)
return nums[0];
if(l==2)
return Math.max(nums[0],nums[1]);
int[] dp1=new int[l];
int[] dp2=new int[l];
Arrays.fill(dp1,-1);
Arrays.fill(dp2,-1);
int a=ans(0,dp1,nums,l-2);
int b=ans(1,dp2,nums,l-1);
return Math.max(a,b);
    }
    public static int ans(int i,int[] dp,int[] nums,int l){
       if (i>l)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
        int rob=nums[i]+ans(i+2,dp,nums,l);
        int drob=ans(i+1,dp,nums,l);
        dp[i]=Math.max(rob,drob);
        return dp[i];
    }
}