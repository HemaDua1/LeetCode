class Solution {
    public int maxRotateFunction(int[] nums) {
 int s=0,f=0;
 int n=nums.length;
 for(int i=0;i<n;i++){
    s+=nums[i];
    f+=i*nums[i];
 }
 int max=f;
 for(int i=1;i<n;i++){
f=f+s-n*nums[n-i];
max=Math.max(f,max);
 }
 return max;
   } 
}