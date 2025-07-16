class Solution {
    public int maximumLength(int[] nums) {
        int ce=0,co=0;
        for(int num:nums){
            if(num%2==0)
            ce++;
            else
            co++;
        }
        int edp=0,odp=0;
        for(int num:nums){
            if(num%2==0)
            edp=Math.max(edp,odp+1);
            else
            odp=Math.max(odp,edp+1);
        }
        return Math.max(Math.max(ce,co),Math.max(edp,odp));
    }
}