class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int c = 1;
        int s = 1;
        for (int i = 1; i < nums.length; i++) {
        if (nums[i] == nums[i - 1] + 1) {
                s++;
                c = Math.max(c,s);
            } else if (nums[i] != nums[i - 1]) {
                s = 1;
            }
        }
        
        return c;
    }
}