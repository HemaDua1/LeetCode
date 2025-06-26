class Solution {
    public int maxProduct(int[] nums) {
        int maxP=Integer.MIN_VALUE;
        int p=1;
        for(int i=0;i<nums.length;i++){
            p*=nums[i];
            maxP=Math.max(p,maxP);
            if(p==0)
            p=1;
        }
        p=1;
        for(int i=nums.length-1;i>-1;i--){
            p*=nums[i];
            maxP=Math.max(p,maxP);
            if(p==0)
            p=1;
        }
        return maxP;
    }
}