class Solution {
    public boolean parseBoolExpr(String ex) {
        Stack<Character> st = new Stack<>();
        
        for (char ch : ex.toCharArray()) {
            if (ch == ',' || ch == '(') {
                continue;  
            }
            
            if (ch == 't' || ch == 'f' || ch == '!' || ch == '&' || ch == '|') {
                st.push(ch); 
            } else if (ch == ')') {
                boolean hasTrue = false, hasFalse = false;
                while (st.peek() == 't' || st.peek() == 'f') {
                    char value = st.pop();
                    if (value == 't') {
                        hasTrue = true;
                    }
                    if (value == 'f') {
                        hasFalse = true;
                    }
                }
                char op = st.pop();
                if (op == '!') {
                    st.push(hasTrue ? 'f' : 't');
                } else if (op == '&') {
                    st.push(hasFalse ? 'f' : 't');
                } else if (op == '|') {
                    st.push(hasTrue ? 't' : 'f');
                }
            }
        }
        return st.peek() == 't';
    }
}
