class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> map=new HashMap<Character,Integer>(); 
       for(char c:s.toCharArray())
       map.put(c,map.getOrDefault(c,0)+1);
       for(char c:t.toCharArray())
       map.put(c,map.getOrDefault(c,0)-1); 
       for(int v:map.values()){
        if(v!=0)
        return false;
       } 
       return true;
    }
}