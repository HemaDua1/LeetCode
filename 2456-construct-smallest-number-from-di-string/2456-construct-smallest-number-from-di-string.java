class Solution {
    public String smallestNumber(String p) {
       StringBuilder sb=new StringBuilder("123456789".substring(0,p.length()+1));
       int j=0;
       for(int i=0;i<=p.length();i++){
        if(i<p.length()&&p.charAt(i)=='D'){
        j++;
        continue;
        }
        if(j>0){
         StringBuilder s=new StringBuilder(sb.substring(i-j,i+1));
         sb.replace(i-j,i+1,s.reverse().toString());  
        }
        j=0;
       } 
return sb.toString();
    }
}