class Solution {
    public int search(int[] nums, int target) {
      return binarysearch(nums,target);  
    }
    public static int binarysearch(int[] nums,int t){
        int s=0,e=nums.length-1,m=0;
        while(s<=e){
            m=s+(e-s)/2;
            if(nums[m]==t)
            return m;
            else if(nums[m]<t){
                s=m+1;
            }
            else
            e=m-1;
        }
        return -1;
    }
}