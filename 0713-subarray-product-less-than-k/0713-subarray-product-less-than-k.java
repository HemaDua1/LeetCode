class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
      int n=nums.length;
      int c=0,p=1;
      for(int s=0,e=0;e<n;e++){
         p=p*nums[e];
         while(s<e && p>=k)
         p/=nums[s++];
         if(p<k){
            int l=e-s+1;
            c+=l;
         }
      } 
      return c; 
    }
}  