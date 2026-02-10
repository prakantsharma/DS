# this file contains the logic and the code for zig_zag the linked list.


```public void zigZag()
{
    @1. find the mid node of the linked list
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;

    }
    Node mid=slow;

    @2. reverse the second half of the linkedlist
    Node curr=mid.next;
    mid.next=null;
    Node prev=null;
    Node next;
    while(next!=null)
    {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node left=head;
    Node right=prev;
    Node nextL,nextR;

    @3 alternate image
    while(left!=null && right!=null){
        nextL=left.next;
        left.next=right;
        nextR=right.next;
        right.next=nextL;

        left=nextL;
        right=nextR;

    }

}```