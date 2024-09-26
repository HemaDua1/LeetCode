class MyCalendar {
List<int[]> booking;
    public MyCalendar() {
     booking=new ArrayList<>();   
    }
    public boolean book(int s, int e) {
     for(int[] b:booking){
        if(s<b[1]&&e>b[0])
        return false;
     } 
     booking.add(new int[]{s,e});
     return true;  
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */