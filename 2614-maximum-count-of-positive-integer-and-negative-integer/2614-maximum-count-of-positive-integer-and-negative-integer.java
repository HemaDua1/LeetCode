class Solution {
    public int maximumCount(int[] nums) {
     int p=0,n=0;
     for(int i:nums){
        if(i>0)
        p++;
        if(i<0)
        n++;
     }   
     return Math.max(p,n);
    }
}