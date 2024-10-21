class Solution {
    public int numSub(String s) {
       long ans=0,c=0;
        // int mod=1e9+7;
    for(char ch:s.toCharArray()){
        if(ch=='1'){
            c++;
        }
        else{
            ans+=(c+1)*c/2;
            c=0;
        }
    }  
    ans+=(c+1)*c/2;
    return (int)(ans%(Math.pow(10,9)+7));  
    }
}