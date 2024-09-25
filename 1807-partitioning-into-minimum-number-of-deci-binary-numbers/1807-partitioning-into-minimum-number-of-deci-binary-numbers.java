class Solution {
    public int minPartitions(String n) {
    int ans=0;
     for(int i=0;i<n.length();i++){
        int a=check(n.charAt(i)-'0');
        ans=Math.max(a,ans);
     }   
     return ans-1;
    }
    public int check(int c){
int a=1;
while(a<=c){
    a=a+1;
}
return a;
    }
}