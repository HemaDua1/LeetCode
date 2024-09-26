class Solution {
    public String validIPAddress(String q) {
    if(ipv4(q))
    return "IPv4";
    else if(ipv6(q))
    return "IPv6";
    else 
    return "Neither";    
    }
    public boolean ipv4(String q){
        if(q.contains(":")||q.startsWith(".")||q.endsWith("."))
        return false;
        String p[]=q.split("\\.");
        if(p.length!=4)
        return false;
        for(String a:p){
            if(a.length()==0||a.length()>3)
            return false;
            for(char c:a.toCharArray()){
                if(Character.isLetter(c))
                return false;
            }
            int n=Integer.parseInt(a);
            if(n<0||n>255)
            return false;
            if(a.length()>1&&(a.startsWith("0")||a.startsWith("00")||a.equals("000")))
            return false;
        }
        return true;
    }
     public boolean ipv6(String q){
        if(q.contains(".")||q.startsWith(":")||q.endsWith(":"))
        return false;
        String p[]=q.split(":");
        if(p.length!=8)
        return false;
        for(String a:p){
            if(a.length()==0||a.length()>4)
            return false;
            for(char c:a.toCharArray()){
                if(Character.isLetter(c))
                {
                    if(Character.isUpperCase(c)&&c>'F')
                    return false;
                    if(Character.isLowerCase(c)&&c>'f')
                    return false;
                }
        }
     }
     return true;
}
}