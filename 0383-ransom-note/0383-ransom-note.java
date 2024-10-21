class Solution {
    public boolean canConstruct(String r, String m) {
HashMap<Character,Integer> h1=new HashMap<>();
for(char ch:m.toCharArray())
h1.put(ch,h1.getOrDefault(ch,0)+1);
for(char ch:r.toCharArray()){
    if(!h1.containsKey(ch)||h1.get(ch)==0)
    return false;
    h1.put(ch,h1.get(ch)-1);
}
return true;
    }
}