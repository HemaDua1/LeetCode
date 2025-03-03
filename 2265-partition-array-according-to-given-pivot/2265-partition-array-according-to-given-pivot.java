class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       ArrayList<Integer> s=new ArrayList<>();
       ArrayList<Integer> l=new ArrayList<>();
       for(int i:nums){
        if(i<pivot)
        s.add(i);
       } 
        for(int i:nums){
        if(i>pivot)
        l.add(i);
       } 
       int[] res=new int[nums.length];
       int c=0,j=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==pivot)
        c++;
       }
       for(int i:s){
       res[j]=i;
       j++;
       }
       while(c>0){
        res[j]=pivot;
        j++;
        c--;
       }
       for(int i:l){
       res[j]=i;
       j++;
       }
       return res;
    }
}