class Solution {
    public boolean canBeValid(String s, String locked) {
        int n=s.length();
        if(n%2!=0)
        return false;
        int oc=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('||locked.charAt(i)=='0')
            oc++;
            else
            oc--;
            if(oc<0)
            return false;
        }
        int ec=0;
        for(int i=n-1;i>-1;i--){
           if(s.charAt(i)==')'||locked.charAt(i)=='0')
            ec++;
            else
            ec--;
            if(ec<0)
            return false; 
        }
        return true;
    }
}