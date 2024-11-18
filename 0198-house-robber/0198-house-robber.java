class Solution {
    public int rob(int[] n) {
int l=n.length;
if(n==null||l==0)
return 0;
if(l==1)
return n[0];
if(l==2)
return Math.max(n[0],n[1]);
int dp[]=new int[l];
dp[0]=n[0];
dp[1]=Integer.max(n[0],n[1]);
for(int i=2;i<l;i++)
dp[i]=Integer.max(n[i]+dp[i-2],dp[i-1]);
return dp[l-1];

    }
}