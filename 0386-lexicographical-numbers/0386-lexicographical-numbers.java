class Solution {
    public List<Integer> lexicalOrder(int n) {
 ArrayList<Integer> l=new ArrayList<>();
        print(n,0,l);
        return l;
	}
private static void print(int n,int ans, ArrayList<Integer> l)
{
	if(ans!=0&&ans<=n)	
l.add(ans);
if(ans>n)
	return;
int i=0;
if(ans==0)
	i=1;
for(;i<=9;i++) {
	print(n,ans*10+i,l);
}
    }
}