class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
     Set<Character> s=new HashSet<>();
     for(char ch:allowed.toCharArray())
     s.add(ch);
     int ans=0;
     for(String str:words){
        boolean f=true;
        for(char ch:str.toCharArray()){
            if(!s.contains(ch)){
                f=false;
                break;
            }
        }
        if(f)
        ans++;
     }   
     return ans;
    }
}