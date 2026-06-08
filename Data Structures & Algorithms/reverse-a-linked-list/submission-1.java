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
    //   public ListNode reverseList(ListNode head) {
    //     if(head==null)return head;
    //     int size=0;
    //     ListNode temp=head;
    //     while (temp!=null){
    //         size++;
    //         temp=temp.next;
    //     }
    //     int arr[]=new int[size];
    //     int i=0;
    //      while (head!=null){
    //          arr[i++]=head.val;
    //          head=head.next;
    //      }
    //     ListNode revHead = new ListNode(arr[arr.length - 1]);
    //     ListNode re = revHead;

    //     i=arr.length-2;
    //      while (i>=0){
    //          ListNode nn=new ListNode(arr[i]);
    //          re.next=nn;
    //          re=re.next;
    //          i--;
    //      }
    //      return revHead;
    // }
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
