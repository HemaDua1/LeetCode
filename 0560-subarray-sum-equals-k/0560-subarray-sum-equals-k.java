class Solution {
    public int subarraySum(int[] nums, int k) {
    HashMap<Integer,Integer> h=new HashMap<>();
    int c=0;
    int s=0;
    //  for(int i=0;i<nums.length;i++){
    //   s+=nums[i];
    //   if(s==k)
    //   c++;
    //   if(h.containsKey(s-k)){
    //  c++;
    //   }
    //   h.put(s,i);
    //  }   
    //  return c;
    h.put(0,1);
    for(int i=0;i<nums.length;i++){
        s+=nums[i];
       if(h.containsKey(s-k))
        c+=h.get(s-k);
        h.put(s,h.getOrDefault(s,0)+1);
    }
    return c;
    }
}