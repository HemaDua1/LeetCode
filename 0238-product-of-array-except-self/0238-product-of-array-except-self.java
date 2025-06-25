class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefP=new int[nums.length];
        int[] sufP=new int[nums.length];
        prefP[0]=1;
        sufP[nums.length-1]=1;
        for(int i=1;i<nums.length;i++)
        prefP[i]=nums[i-1]*prefP[i-1];
        for(int i=nums.length-2;i>=0;i--)
        sufP[i]=nums[i+1]*sufP[i+1];
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        ans[i]=prefP[i]*sufP[i];
        return ans;
    }
}