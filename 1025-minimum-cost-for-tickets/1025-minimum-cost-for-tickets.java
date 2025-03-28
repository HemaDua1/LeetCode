class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int maxi=days[days.length-1];
        boolean[] flag=new boolean[maxi+1];
        int[] dp=new int[maxi+1];
        dp[0]=0;
        for (int day : days) {
            flag[day] = true;
        }
        for(int i=1;i<=maxi;i++){
            if(!flag[i]){
                dp[i]=dp[i-1];
                continue;
            }
            dp[i]=dp[i-1]+costs[0];
            dp[i]=Math.min(dp[Math.max(0,i-7)]+costs[1],dp[i]);
            dp[i]=Math.min(dp[Math.max(0,i-30)]+costs[2],dp[i]);
        }
        return dp[maxi];
    }
}