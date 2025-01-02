class Solution {
    public int[] vowelStrings(String[] words, int[][] q) {
    int ans[]=new int[q.length];
    int w[]=new int[words.length];
    int c=0;
    for(int i=0;i<words.length;i++){
        if(isvalid(words[i]))
        c+=1;
        w[i]=c;
    }
for(int i=0;i<q.length;i++){
 int l=q[i][0];
 int r=q[i][1];
int rc=w[r];
int lc=l>0?w[l-1]:0;
ans[i]=rc-lc;
}
return ans;
    }
    public boolean isvalid(String str){
        char s=str.charAt(0);
        char e=str.charAt(str.length()-1);
        if((s=='a'||s=='e'||s=='i'||s=='o'||s=='u')&&(e=='a'||e=='e'||e=='i'||e=='o'||e=='u'))
        return true;
        return false;
    }
}