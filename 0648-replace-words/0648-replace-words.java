class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
Collections.sort(dictionary, Comparator.comparingInt(String::length));
   String ans="";
   String w[]=sentence.split(" ");
   for(String str:w){
    String temp="";
    for(String a:dictionary){
        if(str.startsWith(a)){
            temp=a;
            break;
        }
    }
if(temp.isEmpty())
ans+=str+" ";
else
ans+=temp+" ";
   }   
   return ans.substring(0,ans.length()-1);
    }
}