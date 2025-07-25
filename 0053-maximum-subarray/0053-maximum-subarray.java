class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int maxE=nums[0];
        for(int i=1;i<nums.length;i++){
            maxE=Math.max(maxE+nums[i],nums[i]);
            res=Math.max(maxE,res);
        }
        return res;
    }
}