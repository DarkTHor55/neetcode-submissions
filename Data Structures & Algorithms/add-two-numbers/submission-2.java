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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode();
        ListNode res=temp;
        int cry=0;
        while(l1!=null&&l2!=null){
            int sum = cry+l1.val+l2.val;
            cry=sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
            l1=l1.next;
            l2=l2.next;

        }
        while(l1!=null){
            int sum = cry+l1.val;
            cry=sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
            l1=l1.next;
        }
        while(l2!=null){
            int sum = cry+l2.val;
            cry=sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
            l2=l2.next;
        }
        while(cry>0){
            temp.next=new ListNode(cry%10);
            cry=cry/10;
            temp=temp.next;

        }
        return res.next;
    }
}
