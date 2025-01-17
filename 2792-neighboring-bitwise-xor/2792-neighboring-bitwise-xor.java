class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n=derived.length;
        int s=0;
      for(int i=0;i<n;i++)
s^=derived[i];
return s==0;
    }
}