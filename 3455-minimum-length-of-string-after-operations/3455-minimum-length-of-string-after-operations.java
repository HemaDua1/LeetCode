class Solution {
    public int minimumLength(String s) {
     HashMap<Character,Integer> h=new HashMap<>();
     for(char ch:s.toCharArray())
     h.put(ch,h.getOrDefault(ch,0)+1);
     int t=0;
     for(char ch:h.keySet()){
        if(h.get(ch)==0)
        continue;
        if(h.get(ch)%2==0)
        t+=2;
        else
        t+=1;
     } 
     return t;  
    }
}