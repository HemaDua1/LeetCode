class Solution {
   static String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> l=new ArrayList<>();
       if(digits.isEmpty())
       return l; 
print(digits,"",l);
return l;
    }
    public void print(String d,String ans,List<String> l){
if(d.isEmpty()){
    l.add(ans);
    return;
}
int di=d.charAt(0)-'0';
String cu=arr[di];
for(int i=0;i<cu.length();i++){
    print(d.substring(1),ans+cu.charAt(i),l);
}
    }
}