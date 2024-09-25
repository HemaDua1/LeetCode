class Solution {
    public List<String> letterCasePermutation(String s) {
   List<String> ans=new ArrayList<>();
   permutation(s,"",ans);
   return ans;     
    }
    public void permutation(String s,String ans,List<String> l){
        if(s.isEmpty()){
            l.add(ans);
            return;
        }
        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     if(Character.isLowerCase(c))
        //     Character.toUpperCase(c);
        //     else
        //     Character.toLowerCase(c);
        //     permutation(s.substring(0,i)+s.substring(i+1),ans+c,l);
            char c=s.charAt(0);
            if(Character.isLetter(c)){
                 permutation(s.substring(1),ans+Character.toLowerCase(c),l);
                  permutation(s.substring(1),ans+Character.toUpperCase(c),l);
            }
            else
            permutation(s.substring(1),ans+c,l);
    }
}