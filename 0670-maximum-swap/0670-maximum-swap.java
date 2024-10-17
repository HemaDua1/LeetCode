class Solution {
    public int maximumSwap(int num) {
     char arr[]=Integer.toString(num).toCharArray(); 
     int n=arr.length;
     int[] f=new int[10];
     for(int i=0;i<n;i++)
     f[arr[i]-'0']=i;
     for(int i=0;i<n;i++){
        for(int d=9;d>arr[i]-'0';d--){
            if(f[d]>i){
                char t=arr[i];
                arr[i]=arr[f[d]];
                arr[f[d]]=t;
                return Integer.parseInt(new String(arr));
            }
        }
     }  
     return num;
    }
}