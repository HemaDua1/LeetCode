class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l=new ArrayList<>();
        if(s.length()<p.length())
        return l;
        HashMap<Character,Integer> h1=new HashMap<>();
        HashMap<Character,Integer> h2=new HashMap<>();
        for(char ch:p.toCharArray())
        h1.put(ch,h1.getOrDefault(ch,0)+1);
        for(char gh:s.substring(0,p.length()).toCharArray())
        h2.put(gh,h2.getOrDefault(gh,0)+1);
        if(h1.equals(h2))
        l.add(0);
        for(int i=p.length();i<s.length();i++){
            char o=s.charAt(i-p.length());
            if(h2.get(o)==1)
            h2.remove(o);
            else
            h2.put(o,h2.get(o)-1);
            char n=s.charAt(i);
            h2.put(n,h2.getOrDefault(n,0)+1);
            if(h1.equals(h2))
            l.add(i-p.length()+1);
        }
return l;
    }
}