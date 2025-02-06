class Solution {
    public int tupleSameProduct(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int p=nums[i]*nums[j];
                ans+=8*h.getOrDefault(p,0);
                h.put(p,h.getOrDefault(p,0)+1);
            }
        }
        return ans;
    }
}