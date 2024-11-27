class Solution {
    public int numIslands(char[][] grid) {
    int n=grid.length;
 int m=grid[0].length;
 int[][] vis=new int[n][m];
 int cnt=0;
 for(int i=0;i<n;i++){
     for(int j=0;j<m;j++){
         if(vis[i][j]==0 && grid[i][j]=='1'){
             bfs(i,j,vis,grid);
             cnt++;
         }
     }
 }
 return cnt;
    }
    class Pair{
        int first;
        int second;
        Pair(int f,int s){
            this.first=f;
            this.second=s;
        }
    }
    public void bfs(int r,int c,int[][] vis,char[][] grid){
        vis[r][c]=1;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(r,c));
         int n=grid.length;
 int m=grid[0].length;
     int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
 while(!q.isEmpty()){
     int row=q.peek().first;
     int col=q.peek().second;
     q.remove();
     for (int i = 0; i < 4; i++) {
                int nr = row + delRow[i];
                int nc = col + delCol[i];
            if(nr>=0&&nr<n&&nc>=0&&nc<m&&grid[nr][nc]=='1'&&vis[nr][nc]==0){
                vis[nr][nc]=1;
                q.add(new Pair(nr,nc));
            }
        }
     }
 }
    }