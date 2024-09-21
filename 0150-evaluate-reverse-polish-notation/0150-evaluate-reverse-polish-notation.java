class Solution {
    public int evalRPN(String[] tokens) {
     Stack<Integer> st=new Stack<>();
     for(String t:tokens){
        if(Character.isDigit(t.charAt(t.length()-1)))
        st.push(Integer.parseInt(t));
        else{
            int b=st.pop();
            int a=st.pop();
            if(t.equals("+"))
            st.push(a+b);
            else if(t.equals("-"))
            st.push(a-b);
            else if(t.equals("*"))
            st.push(a*b);
            else if(t.equals("/"))
            st.push(a/b);
        }
     } 
     return st.pop();  
    }
}