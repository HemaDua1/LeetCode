class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      List<Integer> l=new ArrayList<>();
      HashMap<Integer,Integer> h=new HashMap<>();
      for(int i:nums)
      h.put(i,h.getOrDefault(i,0)+1); 
      for(int i:h.keySet()){
        if(h.get(i)==2)
        l.add(i);
      } 
      return l;
    }
}