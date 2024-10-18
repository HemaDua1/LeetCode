class Solution {
    public int firstUniqChar(String str) {
        int ans=Integer.MAX_VALUE;
     for(char ch='a';ch<='z';ch++){
      int s=str.indexOf(ch);
      if(s!=-1&&s==str.lastIndexOf(ch)){
      ans=Math.min(ans,s);
     } 
     } 
    return ans!=Integer.MAX_VALUE?ans:-1;
    }
}