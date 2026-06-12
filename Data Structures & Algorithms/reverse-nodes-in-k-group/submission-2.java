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

    int size = 0;
    ListNode temp2 = head;

    while (temp2 != null) {
        size++;
        temp2 = temp2.next;
    }

    int loop = size / k;

    ListNode temp = head;

    ListNode dummy = new ListNode();
    ListNode res = dummy;

    for (int i = 0; i < loop; i++) {

        ListNode groupHead = temp;
        ListNode ptr = temp;

        for (int j = 1; j < k; j++) {
            ptr = ptr.next;
        }

        ListNode nextGroup = ptr.next;
        ptr.next = null;

        ListNode reversed = rev(groupHead);

        res.next = reversed;

        while (res.next != null) {
            res = res.next;
        }

        temp = nextGroup;
    }

    if (temp != null) {
        res.next = temp;
    }

    return dummy.next;
}

private ListNode rev(ListNode head) {

    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
    }

    return prev;
}
}
