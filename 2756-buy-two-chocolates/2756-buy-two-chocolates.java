class Solution {
    public int buyChoco(int[] arr, int money) {
    // Arrays.sort(prices);
    // int s=prices[0]+prices[1];
    // if(money-s>-1)
    // return money-s; 
    // else
    // return money;   
    int min=Integer.MAX_VALUE;
    int smin=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            smin=min;
            min=arr[i];
        }
        else if(arr[i]<smin)
        smin=arr[i];
    }
    int s=min+smin;
    if(money-s>-1)
    return money-s; 
    else
    return money;   
    }
}