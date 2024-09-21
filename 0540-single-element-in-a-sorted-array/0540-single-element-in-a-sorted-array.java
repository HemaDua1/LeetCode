class Solution {
    public int singleNonDuplicate(int[] nums) {
      HashMap<Integer,Integer> m=new HashMap<>();
      for(int i:nums){
        m.put(i,m.getOrDefault(i,0)+1);
      }  
      for(int n:m.keySet()){
        if(m.get(n)==1)
        return n;
      }
      return -1;
    }
}