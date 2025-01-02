class Solution {
    public void setZeroes(int[][] m) {
   HashSet<Integer> r=new HashSet<>();
   HashSet<Integer> c=new HashSet<>();  
for(int i=0;i<m.length;i++){
    for(int j=0;j<m[0].length;j++){
        if(m[i][j]==0){
            r.add(i);
            c.add(j);
        }
    }
}
for(int row:r){
    for(int j=0;j<m[0].length;j++)
    m[row][j]=0;
}
for(int col:c){
    for(int j=0;j<m.length;j++)
    m[j][col]=0;
}
    }
}