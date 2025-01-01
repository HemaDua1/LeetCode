class Solution {
    public int maxScore(String s) {
        int ans=0;
        int m=0;
      for(int i=0;i<s.length();i++){
        String ls=s.substring(0,i+1);
        String rs=s.substring(i+1);
        if(!ls.isEmpty()&&!rs.isEmpty())
         m= noofzeroes(ls)+noofones(rs);
        ans=Math.max(ans,m);
      }  
      return ans;
    }
    public int noofzeroes(String s){
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            a++;
        }
        return a;
    }
  public int noofones(String s){
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            a++;
        }
        return a;
    }  
}