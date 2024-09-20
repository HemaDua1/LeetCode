class Solution {
    public boolean isRobotBounded(String inst) {
    int x=0,y=0,j=0;
    int d[][]={{0,1},{1,0},{0,-1},{-1,0}};
    for(int i=0;i<inst.length();i++){
if(inst.charAt(i)=='R')
j=(j+1)%4;
else if(inst.charAt(i)=='L')
j=(j+3)%4;
else{
    x+=d[j][0];
    y+=d[j][1];
}
    } 
     return x==0 && y==0 || j>0;  
    }
}