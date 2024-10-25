class Solution {
    public List<String> removeSubfolders(String[] f) {
       ArrayList<String> l=new ArrayList<>();
Arrays.sort(f);
l.add(f[0]);
for(int i=1;i<f.length;i++){
    String lf=l.get(l.size()-1)+"/";
    if(!f[i].startsWith(lf))
    l.add(f[i]);
}
return l;
    }
}