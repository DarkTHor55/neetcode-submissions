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
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode result = lists[0];

        for (int i = 1; i < lists.length; i++) {
            result = mergeTwoLists(result, lists[i]);
        }

        return result;
    }

     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res=new ListNode();
        ListNode temp=res;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                ListNode node = new ListNode(list1.val);
                res.next=node;
                res=res.next;
                list1=list1.next;
            }else{
                ListNode node = new ListNode(list2.val);
                res.next=node;
                res=res.next;
                list2=list2.next;
            }
        }
        if(list1!=null){
            res.next=list1;
        }
        if(list2!=null){
            res.next=list2;
        }
        return temp.next;
    }
}
