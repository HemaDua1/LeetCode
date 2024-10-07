class Solution {
    public int minLength(String s) {
  int ans=0;
//   StringBuilder sb=new StringBuilder(s);
  while(s.contains("CD")||s.contains("AB")){
   for(int i=0;i<s.length();i++){
    String a=s.substring(i,i+2);
    if(a.equals("CD")||a.equals("AB")){
        s=s.substring(0,i)+s.substring(i+2);
        break;
    }
   }
  } 
  ans=s.length();
  return ans;     
    }
}