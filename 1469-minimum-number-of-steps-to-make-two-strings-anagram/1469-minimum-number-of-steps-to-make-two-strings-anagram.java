class Solution {
    public int minSteps(String s, String t) {
     int ans=0;
     HashMap<Character,Integer> h1=new HashMap<>();
      for(char ch:s.toCharArray())
      h1.put(ch,h1.getOrDefault(ch,0)+1);
       for(char ch:t.toCharArray())
      h1.put(ch,h1.getOrDefault(ch,0)-1); 
      for(int i:h1.values()){
        if(i>0)
        ans+=i;
      }
      return ans;
    }
}