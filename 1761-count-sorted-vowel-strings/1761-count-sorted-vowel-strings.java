class Solution {
    public int countVowelStrings(int n) {
     //(n+r-1)Cr;n=5,r=n
     //(n+4)!/(n!*24)
     return (n+4)*(n+3)*(n+2)*(n+1)/24;
    }
}