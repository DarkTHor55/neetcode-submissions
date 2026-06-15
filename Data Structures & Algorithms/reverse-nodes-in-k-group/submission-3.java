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
    public ListNode reverseKGroup(ListNode head, int k) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int loop=size/k;
        ListNode prevTail=null;
        ListNode ans=null;
        ListNode curr = head;
        for (int i = 0; i < loop; i++) {
            int a=k;
            ListNode fst=curr;
            ListNode prev=null;
            while(a!=0){
                ListNode t=curr.next;
                curr.next=prev;
                prev=curr;
                curr=t;
                a--;
            }
            if(i==0){
                ans=prev;
            } else {
                prevTail.next = prev;
            }
            fst.next=curr;
            prevTail=fst;

        }
       

        return  ans;

    }
}
