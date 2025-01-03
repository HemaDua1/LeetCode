class Solution {
    public int equalPairs(int[][] g) {
        int ans=0;
        int n=g.length;
        Map<String,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            StringBuilder r=new StringBuilder();
            for(int j=0;j<n;j++){
                r.append(g[i][j]).append(",");
            }
            String rs=r.toString();
            m.put(rs,m.getOrDefault(rs,0)+1);
        }
           for(int i=0;i<n;i++){
            StringBuilder c=new StringBuilder();
            for(int j=0;j<n;j++){
                c.append(g[j][i]).append(",");
            }
            String cs=c.toString();
           ans+=m.getOrDefault(cs,0);
        }
        return ans;
    }
}