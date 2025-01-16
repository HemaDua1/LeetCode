class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
       int m=nums1.length;
       int n=nums2.length;
      int ans=0;
      if(n%2==1){
        for(int num:nums1)
        ans^=num;
      }
        if(m%2==1){
        for(int num:nums2)
        ans^=num;
      }
      return ans;
    }
}