class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,List<Integer>> h=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(!h.containsKey(nums[i]))
            h.put(nums[i],new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            h.get(nums[i]).add(i);
        }
        for(int i:h.keySet()){
            List<Integer> l=new ArrayList<>(h.get(i));
            for(int j=0;j<l.size()-1;j++){
                if(l.get(j+1)-l.get(j)<=k)
                return true;
            }
        }
        
        return false;
    }
}