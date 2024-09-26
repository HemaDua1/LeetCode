class Solution {
    public List<Integer> majorityElement(int[] nums) {
     HashMap<Integer,Integer> map=new HashMap<>();
       for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
       } 
       List<Integer> l=new ArrayList<>();
       int n=nums.length;
       for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                l.add(key);  
            }
        }
       return l;  
    }
}