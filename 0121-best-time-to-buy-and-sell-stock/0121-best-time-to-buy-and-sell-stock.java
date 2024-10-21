class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length; 
 int[] min=new int[n];
  int[] max=new int[n];
  min[0]=prices[0];
  for(int i=1;i<n;i++){
min[i]=Math.min(min[i-1],prices[i]);
  }
  max[n-1]=prices[n-1];
   for(int i=n-2;i>-1;i--){
max[i]=Math.max(max[i+1],prices[i]);
  } 
  int  ans=0;
  for(int i=0;i<n;i++)
  ans=Math.max(ans,max[i]-min[i]);
  return ans;
    }
}