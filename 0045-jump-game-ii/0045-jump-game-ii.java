class Solution {
    public int jump(int[] nums) {
    // if(nums[0]==0)
    // return 0;
    // if(nums.length<=1)
    // return 0;
    int n=nums.length;
    int[] dp=new int[n];  
    Arrays.fill(dp,Integer.MAX_VALUE);
    dp[0]=0;
    for(int i=1;i<n;i++){
    for(int k=0;k<i;k++){
       if(k+nums[k]>=i&&dp[k]!=Integer.MAX_VALUE) 
       dp[i]=Math.min(dp[i],dp[k]+1);
    }
}
    return dp[n-1]==Integer.MAX_VALUE?Integer.MAX_VALUE:dp[n-1];
    }
}