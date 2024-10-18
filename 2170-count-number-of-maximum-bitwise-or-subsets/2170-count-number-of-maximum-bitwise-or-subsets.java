class Solution {
    public int countMaxOrSubsets(int[] nums) {
    int maxOR=0 ;
    for(int i:nums)
    maxOR|=i;
    int c[]=new int[1];
    check(nums,0,0,maxOR,c);
return c[0];
    }
    public void check(int[] nums,int idx,int cOR,int maxOR,int[] c){
        if(cOR==maxOR)
        c[0]++;
        for(int i=idx;i<nums.length;i++){
            check(nums,i+1,cOR | nums[i],maxOR,c);
        }
    }
}