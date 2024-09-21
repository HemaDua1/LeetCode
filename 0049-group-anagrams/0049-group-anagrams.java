class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    //   List<List<String>> l=new ArrayList<>();
       Map<String,List<String>> map=new HashMap<>();
       for(String s:strs){
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        String sor=new String(ch);
        if(!map.containsKey(sor))
        map.put(sor,new ArrayList<>());
        map.get(sor).add(s);
       }
      List<List<String>> l=new ArrayList<>(map.values());
      return l;
    }
}