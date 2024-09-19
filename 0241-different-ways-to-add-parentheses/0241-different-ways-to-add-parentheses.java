class Solution {
    public List<Integer> diffWaysToCompute(String e) {
     List<Integer> ans=new ArrayList<>();
     for(int i=0;i<e.length();i++){
        char ch=e.charAt(i);
        if(ch=='-'||ch=='+'||ch=='*'){
            List<Integer> a=diffWaysToCompute(e.substring(0,i));
             List<Integer> b=diffWaysToCompute(e.substring(i+1));
             for(int x:a){
                for(int y:b){
                    if(ch=='+')
                    ans.add(x+y);
                    if(ch=='-')
                    ans.add(x-y);
                    if(ch=='*')
                    ans.add(x*y);
                }
             }
        }
     }  
     if(ans.isEmpty())
     ans.add(Integer.parseInt(e));
     return ans; 
    }
}