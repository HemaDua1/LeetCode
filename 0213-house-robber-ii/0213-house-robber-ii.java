// class Solution {
//     public int rob(int[] nums) {
//      int l=nums.length;
// if(l==0)
// return 0;
// if(l==1)
// return nums[0];
// if(l==2)
// return Math.max(nums[0],nums[1]);
// int[] dp=new int[l];
// Arrays.fill(dp,-1);
// int a=ans(0,dp,nums,l-2);
// Arrays.fill(dp,-1);
// int b=ans(1,dp,nums,l-1);
// return Math.max(a,b);
//     }
//     public static int ans(int i,int[] dp,int[] nums,int l){
//        if (i>l)
//         return 0;
//         if(dp[i]!=-1)
//         return dp[i];
//         int rob=nums[i]+ans(i+2,dp,nums,l);
//         int drob=ans(i+1,dp,nums,l);
//         dp[i]=Math.max(rob,drob);
//         return dp[i];
//     }
// }
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0)
        return 0;
        if(n==1)
        return nums[0];
        if(n==2)
        return Math.max(nums[0],nums[1]);
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n-1;i++)
        dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        int a=dp[n-2];
        Arrays.fill(dp,-1);
          dp[1]=nums[1];
        dp[2]=Math.max(nums[1],nums[2]);
         for(int i=3;i<n;i++)
        dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        int b=dp[n-1];
        return Math.max(a,b);
    }
}