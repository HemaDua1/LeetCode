class Solution {
    public void moveZeroes(int[] nums) {
         int c=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            c++;
         }
         while(c!=0){
            int l=0;
            int r=l+1;
while(r<nums.length){
    if(nums[l]==0){
        exchange(nums,l,r);
    }
    l++;
    r++;
}
c--;
         }
    }
    public void exchange(int[] nums,int l,int r){
int t=nums[l];
nums[l]=nums[r];
nums[r]=t;
    }
}