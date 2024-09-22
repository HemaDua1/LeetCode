class Solution {
    public String stringHash(String s, int k) {
      int n=s.length();
      String ans="";
      List<String> l=new ArrayList<>();
     for(int i=0;i<n;i+=k){
        String sub=s.substring(i,i+k);
l.add(sub);
     } 
     for(String x:l){
        int a=0;
        for(char ch:x.toCharArray()){
        a+=ch-'a';
        }
        a=a%26;
        ans=ans+(char)('a'+a);
     }
     return ans;
    }
}