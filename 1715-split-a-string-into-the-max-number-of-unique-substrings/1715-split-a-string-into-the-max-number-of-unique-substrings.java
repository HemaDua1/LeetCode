class Solution {
    public int maxUniqueSplit(String s) {
        return check(s,new HashSet<>());
    }
    public int check(String s,Set<String> st){
        int m=0;
        for(int i=1;i<=s.length();i++){
            String a=s.substring(0,i);
            if(!st.contains(a)){
                st.add(a);
                m=Math.max(m,1+ check(s.substring(i),st));
                st.remove(a);
            }
        }
        return m;
    }
    }