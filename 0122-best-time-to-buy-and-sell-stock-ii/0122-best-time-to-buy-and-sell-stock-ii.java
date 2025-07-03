class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        int s=prices[0];
        for(int i=1;i<n;i++){
            if(s<prices[i])
            max+=prices[i]-s;
            s=prices[i];
        }
        return max;
    }
}