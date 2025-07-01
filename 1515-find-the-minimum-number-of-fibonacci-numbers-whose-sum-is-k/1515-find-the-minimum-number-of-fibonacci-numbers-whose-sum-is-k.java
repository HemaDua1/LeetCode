class Solution {
    public int findMinFibonacciNumbers(int k) {
        ArrayList<Integer> l=new ArrayList<>();
        l=Fib();
        // System.out.println(l);
        int ans=0;
        for(int i=l.size()-1;i>=0;i--){
            if(k-l.get(i)>=0){
            ans++;
            k-=l.get(i);
            }
        }
        return ans;
    }
    public static ArrayList<Integer> Fib(){
        int f=1,s=1;
        ArrayList<Integer> l=new ArrayList<>();
        l.add(f);
        l.add(s);
        for(int i=2;i<=42;i++){
            int sum=f+s;
            f=s;
            s=sum;
            l.add(s);
        }
        return l;
    }
}