class Solution {
    public void sortColors(int[] nums) {
//    Array.sort(nums); 
   HashMap<Integer,Integer> h=new HashMap<>();
for(int i:nums)
h.put(i,h.getOrDefault(i,0)+1);
int n0=h.getOrDefault(0,0);
int n1=h.getOrDefault(1,0);
int n2=h.getOrDefault(2,0);
for(int i=0;i<n0;i++)
nums[i]=0;
for(int i=n0;i<n0+n1;i++)
nums[i]=1;
for(int i=n0+n1;i<nums.length;i++)
nums[i]=2;
    }
}