class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
      HashMap<Integer,Boolean> h=new HashMap<>();
      for(int i:nums)
      h.put(i,true);
    //   for(int i=0;i<nums.length;i++){
    //     if(h.containsKey(nums[i]+1))
    //     h.put(nums[i]+1,false);
    //     else if(h.containsKey(nums[i]-1))
    //     h.put(nums[i],false);
    //     else
    // h.put(nums[i],true);
    //   } 
      for(int i:nums){
        if(h.containsKey(i-1))
        h.put(i,false);
      }
      int ans=0; 
      for(int i:h.keySet()){
        int k=1;
       if(h.get(i)==true){
       while(h.containsKey(i+k))
       k++;
       }
       ans=Math.max(ans,k);
      }
      return ans;
    }
}