class Solution {
    public int firstUniqChar(String str) {
        int ans=Integer.MAX_VALUE;
     for(int i=0;i<26;i++){
      char ch=(char)('a'+i);
      int s=str.indexOf(ch);
      if(s!=-1){
int l=str.lastIndexOf(ch);
if(s==l)
ans=Math.min(ans,l);
      }
     }  
    return ans!=Integer.MAX_VALUE?ans:-1;
    }
}