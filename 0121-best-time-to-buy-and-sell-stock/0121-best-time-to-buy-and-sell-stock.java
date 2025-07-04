class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=prices[0];
        int ans=0;
        for(int i=1;i<n;i++){
            buy=Math.min(buy,prices[i]);
            ans=Math.max(ans,prices[i]-buy);
        }
        return ans;

    }
}