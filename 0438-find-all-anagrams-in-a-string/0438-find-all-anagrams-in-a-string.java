class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l=new ArrayList<>();
        char gh[]=p.toCharArray();
        Arrays.sort(gh);
p=new String(gh);
    for(int i=0;i<=s.length()-p.length();i++){
        char ch[]=(s.substring(i,i+p.length())).toCharArray();
        Arrays.sort(ch);
        String k=new String(ch);
if(k.equals(p))
l.add(i);
    }  
    return l;  
    }
}