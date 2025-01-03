class Solution {
    public int waysToSplitArray(int[] nums) {
      int ans=0;
     long rs=0,ls=0;
      for(int i=0;i<nums.length;i++)
      rs+=nums[i];
      for(int i=0;i<nums.length-1;i++){
       rs-=nums[i];
       ls+=nums[i];
        if(ls>=rs){
        ans++;
        }
      }  
      return ans;
    }
}