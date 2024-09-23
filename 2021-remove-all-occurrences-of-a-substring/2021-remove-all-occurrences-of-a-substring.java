class Solution {
    public String removeOccurrences(String s, String p) {
     while(s.contains(p)){
int i=s.indexOf(p);
s=s.substring(0,i)+s.substring(i+p.length());
     }  
     return s; 
    }
}