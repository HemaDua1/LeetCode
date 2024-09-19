class MedianFinder {
    //pq1-max heap
    //pq2-min heap
    //odd pq1 top
    //even pq2 top+ pq1 top
    //if length is even before adding the element in pq2 then put the top of pq2 to pq1 and if odd then just add to pq2 and do nothing
PriorityQueue<Integer> pq1;
PriorityQueue<Integer> pq2;
boolean even;
    public MedianFinder() {
     this.pq1=new PriorityQueue<>(Collections.reverseOrder());
     this.pq2=new PriorityQueue<>();
     this.even=true;  
    }
    
    public void addNum(int num) {
      if(even){
        pq2.add(num);
        pq1.add(pq2.poll());
      }  
      else{
        pq1.add(num);
        pq2.add(pq1.poll());
      }
      even=!even;
    }
    
    public double findMedian() {
      if(even){
        return (pq1.peek()+pq2.peek())/2.0;
      }  
      else{
        return pq1.peek()/1.0;
      }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */