class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int y=target-nums[i];
            if(h.containsKey(y))
            return new int[] {h.get(y),i};
            h.put(nums[i],i);
        }
        return new int[] {0,0};
    }
}