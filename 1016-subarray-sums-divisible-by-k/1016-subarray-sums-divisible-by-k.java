class Solution {
    public int subarraysDivByK(int[] nums, int k) {
    HashMap<Integer,Integer> h=new HashMap<>();
    int s=0,c=0;
    h.put(0,1);
    for(int i=0;i<nums.length;i++){
    s+=nums[i];
    int r=s%k;
    if(r<0)
    r+=k;
    if(h.containsKey(r))
    c+=h.get(r);
    h.put(r,h.getOrDefault(r,0)+1);
    }
    return c;
    }
}