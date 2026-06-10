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
   public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 0) {
            return head;
        }
        // if (n == 1 && head != null) return head.next;
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        if(count==n&&temp!=null){
            return temp.next;
        }
        n=count-n;
        count=0;
        ListNode res=temp;
        while (temp!=null){
            if(count+1==n&&temp.next!=null){
                temp.next=temp.next.next;
                count++;
            }else{
                temp=temp.next;
                count++;

            }
        }
        return res;


    }
}
