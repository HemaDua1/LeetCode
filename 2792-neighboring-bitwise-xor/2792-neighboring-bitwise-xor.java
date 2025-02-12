class Solution {
    public boolean doesValidArrayExist(int[] derived) {
      int s=0;
      for(int i:derived)
        s^=i;
      return s==0;
    }
}