class Solution {
    public boolean validateStackSequences(int[] p, int[] po) {
    if(p.length!=po.length)
    return false;
    int j=0;
    Stack<Integer> st=new Stack<>(); 
    for(int i=0;i<p.length;i++){
        st.push(p[i]);
        while(!st.isEmpty()&& st.peek()==po[j]){
            st.pop();
            j++;
        }
    }   
    return st.isEmpty();
    }
}