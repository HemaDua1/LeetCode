class Solution {
    public boolean checkInclusion(String s1, String s2) {
    char c[]=s1.toCharArray();
    Arrays.sort(c);
    String s3=new String(c);
    for(int i=0;i<=s2.length()-s1.length();i++){
        String sub=s2.substring(i,i+s1.length());
        char c1[]=sub.toCharArray();
        Arrays.sort(c1);
        if(s3.equals(new String(c1)))
        return true;
    }
    return false;
    }
}