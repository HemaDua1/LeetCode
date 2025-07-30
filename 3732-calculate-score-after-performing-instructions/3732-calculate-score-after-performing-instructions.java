class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int n=values.length;
        long ans=0;
      boolean flag[]=new boolean[n];  
      Arrays.fill(flag,false);
      for(int i=0;i<n;){
        if(flag[i])
        break;
        flag[i]=true;
        if(instructions[i].equals("add")){
            ans+=values[i];
            i++;
        }
        else if(instructions[i].equals("jump")){
            i+=values[i];
            if(i<0 || i>=n)
            break;
        }
        else 
        i++;
      }
      return ans;
    }
}