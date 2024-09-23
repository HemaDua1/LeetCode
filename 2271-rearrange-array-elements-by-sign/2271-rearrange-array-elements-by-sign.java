class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
     List<Integer> l1=new ArrayList<>();
      List<Integer> l2=new ArrayList<>();
      int ans[]=new int [n];
      for(int i=0;i<n;i++){
        if(nums[i]>0)
        l1.add(nums[i]);
        else
        l2.add(nums[i]);
      }
      int j=0,k=0;
      for(int i=0;i<n;i++){
        if(i%2==0){
        ans[i]=l1.get(j);
        j++;
        }
        else{
            ans[i]=l2.get(k);
            k++;
        }
      }
      return ans;
    }
}