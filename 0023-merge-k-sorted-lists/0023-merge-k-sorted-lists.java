/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
    //     if(lists.length == 0){
    //         return null;
    //     }
    //     PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
    //     for(ListNode head : lists){
    //         if(head != null)
    //             minHeap.add(head);
    //     }

    //     ListNode dummyHead = new ListNode(-1);
    //     ListNode ll = dummyHead;
        
    //     while(!minHeap.isEmpty()){
    //         ListNode curr = minHeap.remove();
    //         ll.next = curr;

    //         ll = ll.next;
    //         if(curr.next != null){
    //             minHeap.add(curr.next);
    //         }
    //     }
    //     ListNode newHead = dummyHead.next;
    //     dummyHead.next = null;
    //     return newHead ;
    // }
    if(lists.length==0)
    return null;
    // PriorityQueue<ListNode> minheap=new PriorityQueue<>((a,b)-> a.val-b.val);
    PriorityQueue<ListNode> minheap=new PriorityQueue<ListNode>(
        new Comparator<ListNode>(){
            public int compare(ListNode a,ListNode b){
            return a.val-b.val;
        }
        });
    for(ListNode head:lists){
        if(head!=null)
        minheap.add(head);
    }
   ListNode dummyhead=new ListNode(-1); 
   ListNode temp=dummyhead;
while(!minheap.isEmpty()){
    ListNode m=minheap.poll();
    dummyhead.next=m;
    dummyhead=dummyhead.next;
    if(m.next!=null)
    minheap.add(m.next);
}
return temp.next;
}
}