class Solution {
    public int buyChoco(int[] prices, int money) {
    Arrays.sort(prices);
    int s=prices[0]+prices[1];
    if(money-s>-1)
    return money-s; 
    else
    return money;   
    }
}