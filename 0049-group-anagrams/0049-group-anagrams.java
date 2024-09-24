class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h=new HashMap<>();
        for(String s:strs){
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String sor=new String(c);
            if(!h.containsKey(sor))
            h.put(sor,new ArrayList<>());
            h.get(sor).add(s);
        }
        List<List<String>> l=new ArrayList<>(h.values());
        return l;
    }
}