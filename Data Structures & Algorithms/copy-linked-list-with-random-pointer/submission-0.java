/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    
      public Node copyRandomList(Node head) {
        if(head==null)return head;
        Node newHead=new Node(0);
        Node curr=head;
        Node newCurr=newHead;
        HashMap<Node,Node> map=new HashMap<>() ;
        while(curr!=null){
            Node temp=new Node(curr.val);
            map.put(curr,temp);
            newCurr.next=temp;
            newCurr=newCurr.next;
            curr=curr.next;
        }
        curr=head;
        newCurr=newHead.next;
        while(curr!=null){
            Node random=curr.random;
            Node temp=map.get(random);
            newCurr.random=temp;

            newCurr=newCurr.next;
            curr=curr.next;
        }
        return newHead.next;

    }
}
