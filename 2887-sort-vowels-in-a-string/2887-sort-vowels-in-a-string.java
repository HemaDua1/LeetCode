class Solution {
    public String sortVowels(String s) {
     List<Character> l=new ArrayList<>();
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        l.add(ch);
     }   
     Collections.sort(l);
     String ans="";
     int i=0;
     for(char ch:s.toCharArray()){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        ans=ans+l.get(i);
        i++;
        }
        else
        ans=ans+ch;
     }
     return ans;
    }
}