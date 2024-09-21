class Solution {
    public List<String> generateParenthesis(int n) {
      List<String> l=new ArrayList<>();
    print(n,0,0,"",l);
    return l; 
    }
    public static void print(int n,int o,int c,String ans,List<String> l){
        if(o==n&&c==n){
            l.add(ans);
            return;
        }
        if(o<n)
        print(n,o+1,c,ans+'(',l);
        if(c<o)
print(n,o,c+1,ans+')',l);
    }
}