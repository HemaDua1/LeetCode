class Solution {
    public boolean lemonadeChange(int[] bills) {
   int c5=0,c10=0;
   for(int i:bills){
    if(i==5)
    c5++;
    if(i==10){
     c10++;
     c5--; 
     if(c5<0)
     return false;  
    }
    if(i==20){
    if(c10>0){
        c10--;
    c5--;
    if(c10<0||c5<0)
    return false;
    } 
    else{
     c5=c5-3;
     if(c5<0)
     return false;   
    }   
    }
   } 
   return true;    
    }
}