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
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if(head==null || l==r)
        return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        for(int i=0;i<l-1;i++)
        prev=prev.next;
        ListNode curr=prev.next;
        for(int i=0;i<r-l;i++){
            ListNode temp=curr.next;
            curr.next=temp.next;
            temp.next=prev.next;
            prev.next=temp;
        }
        return dummy.next;
    }
}