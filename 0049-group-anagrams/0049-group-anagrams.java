class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h=new HashMap<>();
        for(String s:strs){
            // char c[]=s.toCharArray();
            // Arrays.sort(c);
            // String sor=new String(c);
            String sor=findKey(s);
            if(!h.containsKey(sor))
            h.put(sor,new ArrayList<>());
            h.get(sor).add(s);
        }
        List<List<String>> l=new ArrayList<>(h.values());
        return l;
    }
    public String findKey(String s){
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']++;
        }
        String k="";
        for(int a:arr)
        k=k+"#"+a;
        return k;
    }
}