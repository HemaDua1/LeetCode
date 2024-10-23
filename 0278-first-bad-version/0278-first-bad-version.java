/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
      int f=1;
      int l=n;
while(f<l){
    int m=f+(l-f)/2;
    if(isBadVersion(m))
    l=m;
    else
    f=m+1;
}
return f;
    }
}